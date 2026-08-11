1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length ;
4        int dp[] = new int[n] ;//dp creation
5        dp[0] = nums[0] ;//base case.............
6        for(int i =1;i<n;i++){
7            int take = nums[i] ;
8            if(i>1){
9                take += dp[i-2];
10            }
11            int nottake = i>=1?dp[i-1]:0;
12            
13            dp[i] = Math.max(take,nottake) ;
14        }
15        return dp[n-1] ;
16    }
17}