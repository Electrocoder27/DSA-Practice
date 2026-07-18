1class Solution {
2    public int countBinarySubstrings(String s) {
3        int n = s.length() ;
4        int count= 0;
5        int curr = 1;
6        int prev = 0;
7        char chp= s.charAt(0) ;
8        for(int i =1;i<n;i++){
9            char ch = s.charAt(i) ;
10            if(chp==ch){
11                curr++;
12            }
13            else{
14                prev = curr;
15                curr = 1;
16            }
17
18            //count += Math.min(prev,curr) ;
19            if(prev>=curr)  count++ ;
20            chp = ch ;
21        }
22        return count;
23    }
24}