1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        int n = nums.length;
4        for(int i =0;i<n;i++){
5            nums[i] = nums[i]*nums[i] ;
6        }        
7        Arrays.sort(nums) ;
8        long oddsum = Arrays.stream(nums,0,n/2).asLongStream().sum() ;
9        long evensum = Arrays.stream(nums,n/2,n).asLongStream().sum() ;
10
11        return (evensum-oddsum) ;
12    }
13}
14