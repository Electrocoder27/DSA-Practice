1class Solution {
2    private int digprod(int n){
3        int prod = 1;
4        while(n>0){
5            int d = n%10 ;
6            prod *=d;
7            n = n/10 ;
8        }
9        return prod ;
10    }
11    public int smallestNumber(int n, int t) {
12        while(digprod(n)%t !=0){
13            n++;
14        }
15        return n ;
16    }
17}