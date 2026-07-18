1class Solution {
2    public int gcd(int a,int b){
3        while(b !=0){
4            int temp = b ;
5            b = a%b ;
6            a = temp ;
7        }
8
9        return a;
10    }
11    public int findGCD(int[] nums) {
12        int n = nums.length ;
13        int sm = Integer.MAX_VALUE ;
14        int lr = Integer.MIN_VALUE ;
15        for(int i =0;i<n;i++){
16            sm = Math.min(sm,nums[i]);
17            lr =  Math.max(lr,nums[i]) ;
18        }
19
20        return gcd(sm,lr) ;
21    }
22}