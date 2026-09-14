1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int start = 0;
4        int end = nums.length-1 ;
5           while(start<=end){
6                int mid = start + (end-start)/2 ;
7                if(nums[mid]==target){
8                    return mid ;
9                }
10                else if(nums[mid]<target){
11                    start = mid+1 ;
12                }
13                else{
14                    end = mid -1 ;
15                }
16           }
17        return start ;
18    }
19}