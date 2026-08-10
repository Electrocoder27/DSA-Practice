1class Solution {
2    private int solve(int per,int i,int m ,int [] piles,int [][][]dp){
3        int n = piles.length ;
4        if(i>=n){
5            return 0 ;
6        }
7        if(dp[per][i][m] != -1){
8            return dp[per][i][m] ;
9        }
10        int stone = 0;
11        int res = per ==1? -1:Integer.MAX_VALUE;
12
13        for(int x = 1;x<=Math.min(2*m,n-i);x++){
14            stone += piles[i+x-1] ;
15
16            if(per ==1){
17                res = Math.max(res,stone+solve(0,i+x,Math.max(m,x),piles,dp));
18            }
19            else{
20                res = Math.min(res,solve(1,i+x,Math.max(m,x),piles,dp));
21            }
22        }
23
24        return dp[per][i][m] = res;
25    }
26    public int stoneGameII(int[] piles) {
27        int m =1;         
28        int dp[][][] = new int[2][101][101];
29        for (int[][] d : dp) {
30            for (int i = 0; i < 101; i++) {
31                Arrays.fill(d[i], -1);
32            }
33        }
34        return solve(1,0,m,piles,dp) ;
35    }
36}