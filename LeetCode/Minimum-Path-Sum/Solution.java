1class Solution {
2    // private int solve(int n,int m ,int[][]grid){
3    //     if(n==0 && m==0){
4    //         return grid[0][0] ;
5    //     }
6    //     if(n<0 || m<0){
7    //         return Integer.MAX_VALUE ;
8    //     }
9    //     int up = solve(n-1,m,grid) ;
10    //     int lt =  solve(n,m-1,grid) ;
11
12    //     int minprev = Math.min(up,lt) ;
13    //     return grid[n][m]+minprev;
14    // }
15    public int minPathSum(int[][] grid) {
16        int n = grid.length ;
17        int m = grid[0].length ;
18        int dp[][] = new int[n][m] ;
19        dp[0][0] = grid[0][0] ;
20
21        for(int i =1;i<n;i++){
22            dp[i][0] = grid[i][0] +dp[i-1][0] ;
23        }
24        for(int j =1;j<m;j++){
25            dp[0][j] = grid[0][j] + dp[0][j-1] ;
26        }
27
28        for(int i =1;i<n;i++){
29            for(int j =1;j<m;j++){
30                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
31            }
32        }
33
34        return dp[n-1][m-1] ;
35    }
36}