1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int n = nums.length ;
4        int xor = 0 ;
5        boolean nonzero = false ;
6        for(int i =0;i<n;i++){
7            xor = xor^nums[i] ;
8            if(nums[i] !=0){
9                nonzero = true ;
10            }
11        }
12
13        if(xor != 0){ 
14            return n ;
15        }
16        return nonzero? n-1:0;
17    }
18}