1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        int n = s.length() ;
4        int cone = 0;
5        for(int i =0;i<n;i++){
6            char ch = s.charAt(i) ;
7            if(ch == '1'){
8                cone++ ;
9            }
10        }
11        ArrayList<Integer> list = new ArrayList<>() ;
12        int i =0;
13        while(i<n){
14            if(s.charAt(i) == '0'){
15                int start = i;
16                while(i<n && s.charAt(i)=='0'){
17                    i++;
18                }
19
20                list.add(i-start) ;
21            }
22            else{
23                i++ ;
24            }
25        }
26        int maxpairsum = 0 ;
27        for(int j =1;j<list.size();j++){
28            maxpairsum = Math.max(maxpairsum,list.get(j)+list.get(j-1));
29        }
30        return cone+maxpairsum ;
31    }
32}