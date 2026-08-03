1class Solution {
2    public boolean stoneGame(int[] piles) {
3        int n = piles.length ;
4        int dp[][] = new int[n][n] ;
5
6        for(int i=0;i<n;i++){
7            dp[i][i] = piles[i] ;
8        }
9
10        for(int len = 2;len<=n;len++){
11            for(int i =0;i<=n-len;i++){
12                int j = i+len-1;
13                dp[i][j] = Math.max(piles[i]-dp[i+1][j],piles[j]-dp[i][j-1]) ;
14            }
15        }
16
17        return dp[0][n-1]>0;
18    }
19}