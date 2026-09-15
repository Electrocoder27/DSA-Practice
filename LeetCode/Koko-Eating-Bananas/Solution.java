1class Solution {
2    private int totalhrs(int piles[],int k){
3        int n = piles.length ;
4        int thrs = 0;
5        for(int i=0;i<n;i++){
6            thrs += Math.ceil((double) piles[i] / k);
7        }
8        return thrs;
9    }
10    public int minEatingSpeed(int[] piles, int h) {
11       int max = Integer.MIN_VALUE ;
12       for(int num:piles){
13            max = Math.max(max,num);
14        }
15       int ans = max ;
16       int l = 1;
17       int r = max ;
18       while(l<=r){
19            int m = l+(r-l)/2 ;
20            if(totalhrs(piles,m)<=h){
21                ans = m;
22                r =m-1;
23            }
24            else{
25                l = m+1;
26            }
27       }
28       return ans ;
29    }
30}