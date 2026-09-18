1class Solution {
2    private int fun(int[] nums,int c){
3        int n = nums.length ;
4        int l = 0;
5        int d = 1;
6        for(int i =0;i<n;i++){
7            if(l + nums[i] >c){
8                d += 1 ;
9                l = nums[i] ;
10            }
11            else{
12                l += nums[i] ;
13            }
14        }
15        return d ;
16    }
17    public int shipWithinDays(int[] weights, int days) {
18        int sum = 0;
19        int max = Integer.MIN_VALUE ;
20
21        for(int num:weights){
22            sum += num ;
23            max = Math.max(num,max) ;
24        }
25        int l = max;
26        int r = sum ;
27        int ans  = -1;
28        while(l<=r){
29            int m = l +(r-l)/2 ;
30            int cdays = fun(weights,m) ;
31            if(cdays<= days){
32                ans = m;
33                r = m-1;
34            }
35            else{
36                l = m+1;
37            }
38        }
39        return ans;
40    }
41}