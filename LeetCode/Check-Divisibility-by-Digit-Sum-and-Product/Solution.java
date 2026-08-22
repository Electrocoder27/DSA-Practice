1class Solution {
2    public boolean checkDivisibility(int n) {
3        int prod = 1;
4        int sum = 0 ;
5        int t = n;
6        while(t>0){
7            int dig = t%10 ;
8            sum += dig;
9            prod *=dig ;
10            t = t/10 ;
11        }
12        if(n%(sum+prod) ==0){
13            return true ;
14        }
15        return false ;
16    }
17}