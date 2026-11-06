class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m = queries.length ;
        int [] res = new int[m] ;
        
        Arrays.sort(logs,(a,b)-> Integer.compare(a[1],b[1])) ;
        int[][] sortedq = new int[m][2] ;

        for(int i=0;i<m; i++){
            sortedq[i][0] = queries[i] ;
            sortedq[i][1] = i;
        } 
        Arrays.sort(sortedq,(a,b) -> Integer.compare(a[0],b[0])) ;

        int[] servercount = new int[n+1] ;
        int actives = 0;

        int l = 0;
        int r = 0;


        for(int q[] :sortedq) {
            int qt = q[0] ;
            int oidx = q[1] ;
            int st = qt-x;
            
            //expanding the window!!
            while(r<logs.length && logs[r][1] <= qt){
                int sid = logs[r][0] ;

                if(servercount[sid] == 0){
                    actives++ ;
                }
                servercount[sid]++;
                r++;
            }
            //shrinking window..........
            while(l<logs.length && logs[l][1] <st){
                int sid = logs[l][0] ;
                servercount[sid]-- ;
                if(servercount[sid] ==0){
                    actives--;
                }
                l++ ;
            }
            res[oidx] = n -actives ;
        }
        return res ;
    }
}