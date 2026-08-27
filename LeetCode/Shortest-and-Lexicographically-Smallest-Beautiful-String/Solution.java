1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3        int n =s.length() ;
4        int count = 0 ;
5        int l = 0;
6        int len =Integer.MAX_VALUE ;
7        String res = "" ;
8        for(int r=0;r<n;r++){
9            char ch =s.charAt(r) ;
10            if(ch == '1'){
11                count++;
12            }
13            while(count >k || (l<r && s.charAt(l)=='0' && count == k)){
14                if(s.charAt(l) =='1'){
15                    count--;
16                }
17                l++;
18            }
19            if(count ==k){
20                int currlen = r-l+1;
21                String sub = s.substring(l,r+1) ;
22
23                if(currlen<len){
24                    len = Math.min(currlen,len) ;
25                    res = sub;
26                }
27                else if(currlen == len){
28                    if(res.isEmpty()  || sub.compareTo(res)<0){
29                        res = sub ;
30                    }
31                }
32            }
33        }
34
35        return res ;
36    }
37}