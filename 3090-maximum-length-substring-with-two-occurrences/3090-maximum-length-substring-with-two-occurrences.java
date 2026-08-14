class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length() ;
        int len  = 0;
        int l = 0;
        int r = 0;
        int freq[] = new int[26] ;
        while(r<n){
            char ch = s.charAt(r) ;
            freq[ch-'a']++;
            while(freq[ch-'a']>2){
                freq[s.charAt(l)-'a']--;
                l++;
            }       
            len = Math.max(len,r-l+1) ;
            r++;
        }
        return len ;
    }
}