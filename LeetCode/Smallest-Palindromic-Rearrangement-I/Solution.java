1class Solution {
2    public String smallestPalindrome(String s) {
3        int  n = s.length() ;
4        int mid = n/2 ;
5        char [] arr = s.toCharArray() ;
6        
7        
8        Arrays.sort(arr,0,mid);
9        StringBuilder sb = new StringBuilder("") ;
10        
11        for(int i =0;i<mid;i++){
12            sb.append(arr[i]);
13        }
14
15        StringBuilder res = new StringBuilder(sb) ;
16
17        if(n%2 !=0){
18            res.append(s.charAt(mid));
19        }
20        res.append(sb.reverse());
21        return res.toString() ;
22    }
23}