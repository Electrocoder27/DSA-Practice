1class Solution {
2    // private int solve(int r,int c){
3    //     if(r<1 || c<1){
4    //         return 1 ;
5    //     }
6
7    //     int d = solve(r-1,c) ;
8    //     int rt = solve(r,c-1);
9
10    //     return (d+rt) ;
11    // }
12    public int uniquePaths(int m, int n) { 
13        int dp[][] = new int[m][n] ;
14
15        for(int i =0;i<m;i++){
16            dp[i][0] = 1 ;
17        }
18        for(int j =0;j<n;j++){
19            dp[0][j] = 1;
20        }
21
22        for(int i =1;i<m;i++){
23            for(int j =1;j<n;j++){
24                dp[i][j] = dp[i-1][j] + dp[i][j-1];
25            }
26        }
27
28        return dp[m-1][n-1];
29    }
30}