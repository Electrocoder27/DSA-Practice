1class Solution {
2    public int maximumProduct(int[] nums) {
3        int n = nums.length ;
4        Arrays.sort(nums) ;
5        int prod1 = nums[n-1]*nums[n-2]*nums[n-3] ;
6        int prod2 = nums[0]*nums[1]*nums[n-1] ;
7        
8        return Math.max(prod1,prod2);
9    }
10}