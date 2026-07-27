1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length ;
4        Arrays.sort(nums) ;
5        int prod = (nums[n-1]-1)*(nums[n-2]-1);
6        return prod ;
7    }
8}