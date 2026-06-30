1class Solution {
2    public int numberOfSubstrings(String s) {
3        int [] ls = new int[3] ;
4        Arrays.fill(ls,-1) ;
5        int n =s.length() ;
6        int count =0;
7        for(int i =0;i<n;i++) {
8            char ch = s.charAt(i) ;
9            ls[ch-'a'] = i ;
10            if(ls[0]!= -1 && ls[1] != -1 && ls[2] != -1) {
11                count += 1 + Math.min(ls[0],Math.min(ls[1],ls[2])) ;
12            }
13        }
14        return count ;
15    }
16}
17