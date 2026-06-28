1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3         int n = nums.length ;
4        int [] prefixcount = new int[n] ;
5        int res = 0 ;
6        int count  = 0;
7        for(int i =0;i<n;i++){
8            if(nums[i] ==  target){
9                count++;
10            }
11            else{
12                count-- ;
13            }
14            prefixcount[i] = count ;
15        }
16
17        for(int i =0;i<n;i++){
18            for(int j=i;j<n;j++){
19                int prevcount = (i==0) ?0:prefixcount[i-1] ;
20                if(prefixcount[j]-prevcount >0){
21                    res++;
22                }
23            }
24        }
25        return res ;
26    }
27}