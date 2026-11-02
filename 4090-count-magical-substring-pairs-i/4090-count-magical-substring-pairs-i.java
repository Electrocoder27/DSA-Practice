class Solution {
    public int countMagicalPairs(String s) {
        int n = s.length() ;
        long mp = 0L;

        for(int j =0;j<n-1;j++){
            int []lcnt = new int[27] ;
            int []rcnt = new int[27] ;

            boolean[]ltseen = new boolean[26] ;
            int ltdist = 0;
            for(int i =j;i>=0;i--){
                char ch = s.charAt(i) ;
                if(!ltseen[ch-'a']){
                    ltseen[ch -'a']  = true ;
                    ltdist++ ;
                }
                lcnt[ltdist]++ ;
            }

            boolean[] rtseen = new boolean[26] ;
            int rtdist = 0;
            for(int k =j+1;k<n;k++){
                char ch =s.charAt(k) ;
                if(!rtseen[ch-'a']){
                    rtseen[ch-'a'] = true ;
                    rtdist++;
                }
                rcnt[rtdist]++ ;
            }

            for(int d = 1;d<=26;d++){
                mp += (long)lcnt[d]*rcnt[d] ;
            }
        }   
        return (int)mp ;
    }
}