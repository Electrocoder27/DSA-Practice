1class Solution {
2    public long[] resultArray(int[] nums, int k) {
3        int n = nums.length;
4        long[] res = new long[k];
5        
6        // dp[r] stores the count of subarrays ending at the previous position 
7        // whose product modulo k is equal to r
8        long[] dp = new long[k];
9
10        for (int i = 0; i < n; i++) {
11            long[] nextDp = new long[k];
12            int val = nums[i] % k;
13
14            // 1. Extend all existing subarrays ending at i - 1 to include nums[i]
15            for (int r = 0; r < k; r++) {
16                if (dp[r] > 0) {
17                    int newRem = (r * val) % k;
18                    nextDp[newRem] += dp[r];
19                }
20            }
21
22            // 2. Add the single-element subarray [nums[i]]
23            nextDp[val]++;
24
25            // 3. Add current ending counts to the global result array
26            for (int r = 0; r < k; r++) {
27                res[r] += nextDp[r];
28            }
29
30            // Move to the next index
31            dp = nextDp;
32        }
33
34        return res;
35    }
36}