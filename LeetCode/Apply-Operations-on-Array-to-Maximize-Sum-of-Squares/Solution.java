1class Solution {
2    public int maxSum(List<Integer> nums, int k) {
3        int m = 1000000007 ;
4        int n  = nums.size();
5        int [] bits= new int[32];
6        for(int num:nums){
7            for(int i =0;i<32;i++){
8                if((num & (1<<i)) !=0){
9                    bits[i]++;
10                }
11            }
12        }
13        long res = 0;
14        while(k>0){
15            long curr = 0;
16            for(int b =0;b<32;b++){
17                if(bits[b] >0){
18                    bits[b]--;
19                    curr = (curr|(1<<b)) ;
20                }
21            }
22            res = (res + (curr*curr)%m)%m ;
23            k--;
24        }
25        return (int)res ;
26    }
27}