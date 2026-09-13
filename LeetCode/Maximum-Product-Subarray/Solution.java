1class Solution {
2    public int maxProduct(int[] nums) {
3        if (nums.length == 0) return 0;
4
5        int maxProd = nums[0];
6        int minProd = nums[0];
7        int result = nums[0];
8
9        for (int i = 1; i < nums.length; i++) {
10            if (nums[i] < 0) { // Swap min and max when encountering a negative number
11                int temp = maxProd;
12                maxProd = minProd;
13                minProd = temp;
14            }
15
16            maxProd = Math.max(nums[i], nums[i] * maxProd);
17            minProd = Math.min(nums[i], nums[i] * minProd);
18            result = Math.max(result, maxProd);
19        }
20
21        return result;
22    }
23}