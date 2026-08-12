1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        int n = nums.length ;
4        int i = 0;
5        int j =0;
6        int res = 0;
7        HashMap<Integer,Integer> freq = new HashMap<>() ;
8
9        while(j<n){
10            freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);
11            while(i<j && freq.get(nums[j])>k){
12                freq.put(nums[i],freq.get(nums[i])-1);
13                i++;
14            }
15            res = Math.max(res,j-i+1) ;
16            j++;
17        }
18
19
20        return res ;
21    }
22}