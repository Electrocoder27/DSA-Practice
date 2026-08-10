1class Solution {
2    // private boolean solve(int n){
3    //     if(n==0){//alice ka call tha ye
4    //         return false ;
5    //     }
6
7    //     for(int i =1;i*i<=n;i++){
8    //         if(solve(n-i*i) == false){//bob har gya
9    //             return true ;
10    //         }
11    //     }
12    //     return false ;//
13    // }
14    public boolean winnerSquareGame(int n) {
15        boolean dp[] = new boolean[n+1] ;
16
17
18        for(int i =0;i<n+1;i++){
19            for(int k =1;k*k<=i;k++){
20                if(dp[i-k*k] == false){
21                    dp[i] =  true ;
22                    break ;
23                }
24            }
25        }
26
27        return dp[n] ;
28    }
29}