1class Solution {
2    public boolean stoneGameIX(int[] stones) {
3        int n = stones.length ;
4        if(n <=1){
5            return false ;
6        }
7        int count1 = 0;
8        int count2 = 0;
9        int count0 = 0;
10        for(int i =0;i<n;i++){
11            if(stones[i]%3 ==1){
12                count1++;
13            }
14            else if(stones[i]%3==2){
15                count2++;
16            } 
17            else{
18                count0++;
19            }
20        }    
21        if(count0 %2 ==0){
22            return count1>=1 && count2>=1 ;
23        }
24
25        return Math.abs(count1-count2)>=3 ;
26    }
27}