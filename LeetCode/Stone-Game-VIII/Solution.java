1class Solution {
2    public int stoneGameVIII(int[] stones) {
3        int n = stones.length;
4        
5        // Step 1: Compute prefix sums
6        // prefixSum[i] store the sum of the first (i + 1) stones
7        long[] prefixSum = new long[n];
8        prefixSum[0] = stones[0];
9        for (int i = 1; i < n; i++) {
10            prefixSum[i] = prefixSum[i - 1] + stones[i];
11        }
12        
13        // Step 2: Dynamic Programming with space optimization
14        // maxDiff tracks max(prefixSum[j] - dp[j]) for j > i
15        // Starting at the last index where Alice/Bob can take all n stones:
16        long maxDiff = prefixSum[n - 1];
17        
18        // Iterate backwards from the second-to-last index down to index 1 (x >= 2 removed stones)
19        for (int i = n - 2; i >= 1; i--) {
20            maxDiff = Math.max(maxDiff, prefixSum[i] - maxDiff);
21        }
22        
23        return (int) maxDiff;
24    }
25}