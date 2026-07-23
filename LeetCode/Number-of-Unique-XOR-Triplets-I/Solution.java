1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int  n = nums.length ;
4        if(n==1 || n==2){
5            return n ;
6        }
7
8        int ans = 1;
9        while(ans <=n){
10            ans *=2 ;
11        }
12
13        return ans;
14    }
15}