1class Solution {
2    public int minPathSum(int[][] grid) {
3        int n = grid.length ;
4        int m = grid[0].length ;
5
6        int dp[][] = new int[n][m] ;
7
8        dp[0][0] = grid[0][0] ;
9
10        for(int i =1;i<n;i++) {
11            dp[i][0] = grid[i][0] + dp[i-1][0] ;
12        }
13        for(int j =1;j<m;j++) {
14            dp[0][j] = grid[0][j] + dp[0][j-1] ;
15        }
16
17        for(int i =1;i<n;i++) {
18            for(int j = 1;j<m;j++) {
19                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]) ;
20            }
21        }
22        return dp[n-1][m-1] ;
23    }
24}