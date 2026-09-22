1class Solution {
2    private boolean ispossible(int lim,int k,int nums[]){
3        int n = nums.length ;
4        int sum = 0;
5        int ndiv= 1;
6        for(int i =0;i<n;i++){
7            if(nums[i] >lim){
8                return false ;
9            }
10            if(sum+nums[i] >lim){
11                ndiv++;
12                sum =nums[i] ;
13            }
14            else{
15                sum += nums[i] ;
16            }
17        }
18        return ndiv<=k ;
19    }
20    public int splitArray(int[] nums, int k) {
21        int n =nums.length ;
22        int max = Integer.MIN_VALUE ;
23        int sum = 0;
24        for(int num:nums){
25            max = Math.max(max,num) ;
26            sum += num ;
27        }
28        int ans  =sum;
29        int l = max;
30        int h = sum;
31        while(l<=h){
32            int m = l + (h-l)/2 ;
33            if(ispossible(m,k,nums)){
34                ans = m;
35                h=m-1;
36            }
37            else{
38                l = m+1;
39            }
40        }
41        return ans;
42    }
43}