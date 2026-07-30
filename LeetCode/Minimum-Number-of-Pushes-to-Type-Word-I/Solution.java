1class Solution {
2    public int minimumPushes(String word) {
3        int n = word.length() ;
4        if(n <= 8){
5            return n;
6        }
7        else if(n <= 16){
8            return 8+(n-8)*2;
9        }
10        else if(n <= 24){
11            return 24+(n-16)*3;
12        }
13        else{
14            return 48+(n-24)*4;
15        }
16
17
18    }
19}