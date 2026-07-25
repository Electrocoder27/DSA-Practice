1class Solution {
2    public int maxProduct(int n) {
3        int max1 = 0;
4        int max2 = 0;
5
6        while(n>0){
7            int d = n%10 ;
8            n = n/10 ;
9
10            if(d>max1){
11                max2 = max1;
12                max1 = d ;
13            }
14            else if(d>max2){
15                max2 = d ;
16            }
17        }
18
19        return max1*max2 ;
20    }
21}