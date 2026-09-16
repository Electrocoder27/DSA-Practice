1class Solution {
2    private boolean poss(int [] nums,int d,int m,int k){
3        int n = nums.length ;
4        int noofb = 0;
5        int count = 0;
6        for(int i =0;i<n;i++){
7            if(nums[i] <=d){
8                count++; 
9            }
10            else{
11                noofb += (count/k) ;
12                count = 0;
13            }
14        }
15        noofb += (count/k) ;
16        return noofb >= m ;
17    }
18    public int minDays(int[] bloomDay, int m, int k) {
19        int n = bloomDay.length ;
20        int min = (int)1e9 ;
21        int max = -(int)1e9 ;
22        for(int num:bloomDay){
23            max = Math.max(max,num) ;
24            min = Math.min(min,num) ;
25        }
26        int l = min;
27        int h = max;
28        int ans = -1;
29        while(l<= h){
30            int mi = l + (h-l)/2 ;
31            if(poss(bloomDay,mi,m,k)){
32                ans = mi;
33                h = mi-1;
34            }
35            else{
36                l = mi+1;
37            }
38        }
39        // for(int d = min ;d<=max;d++){
40        //     if(poss(bloomDay,d,m,k)){
41        //         return d;
42        //     }
43        // }
44        return ans;
45    }
46}