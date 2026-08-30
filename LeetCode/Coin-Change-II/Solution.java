1class Solution {
2    // private int solve(int i ,int [] coins,int amt){
3    //     if(i==0){
4    //         if(amt%coins[i]==0){
5    //             return 1;
6    //         }
7    //         else{
8    //             return 0 ;
9    //         }
10    //     }
11    //     int ntk = solve(i-1,coins,amt) ;
12    //     int tk = 0;
13    //     if(coins[i]<=amt){
14    //         tk += solve(i,coins,amt-coins[i]);
15    //     } 
16
17    //     return (ntk+tk) ;
18    // }
19    public int change(int amount, int[] coins) {
20        // int dp[] = new int[amount+1] ;
21        // dp[0] = 1 ;
22        // for(int coin: coins) {
23        //     for(int j =coin;j<=amount;j++) {
24        //         dp[j] +=dp[j-coin] ;
25        //     }
26        // }
27        // return dp[amount]==1e9 ?0:dp[amount] ;
28        int n = coins.length ;
29        int dp[][] = new int[n][amount+1] ;
30        for(int i =0;i<=amount;i++){
31            if(i%coins[0] == 0){
32                dp[0][i] = 1 ;
33            }
34            else{
35                dp[0][i] = 0;
36            }
37        }
38
39        for(int i =1;i<n;i++){
40            for(int t = 0;t<=amount;t++){
41                int ntk = dp[i-1][t] ;
42                int tk = 0;
43                if(t>= coins[i]){
44                    tk = dp[i][t-coins[i]];
45                }
46
47                dp[i][t] = ntk+tk ;
48            }
49        }
50        return dp[n-1][amount] ;
51    }
52}