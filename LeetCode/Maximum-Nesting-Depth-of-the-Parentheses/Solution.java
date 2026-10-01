1class Solution {
2    public int maxDepth(String s) {
3        int maxdepth = 0;
4        int temp =0;
5        for(int i =0;i<s.length() ;i++) {
6            if(s.charAt(i) =='(') {
7                temp++ ;
8            }
9            else if(s.charAt(i) == ')') {
10                maxdepth = Math.max(maxdepth,temp) ;
11                temp-- ;
12            }
13            else{
14                continue ;
15            }
16        }
17
18        return maxdepth ;
19    }
20}