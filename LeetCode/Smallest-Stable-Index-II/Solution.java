1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length ;
4        int [] premax = new  int[n] ;
5        int [] postmin = new int[n] ;
6        postmin[n-1] = nums[n-1] ;
7        for(int i =n-2;i>=0;i--){
8            postmin[i] = Math.min(nums[i],postmin[i+1]) ;
9        }
10        premax[0] = nums[0] ;
11        for(int i =1;i<n;i++){
12            premax[i] = Math.max(nums[i],premax[i-1]) ;
13        }
14
15        for(int i =0;i<n;i++){
16            if(premax[i]-postmin[i] <=k){
17                return i ;
18            }
19        }
20        return -1;
21    }
22}