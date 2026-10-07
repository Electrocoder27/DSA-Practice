1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0){
4            return false;
5        }
6        int temp = x ;
7        int rev = 0 ;
8        while(temp != 0){
9            int pop = temp%10 ;
10            temp = temp /10 ;
11            rev = 10*rev +pop ;
12        }
13        if(rev == x){
14            return true ;
15        }
16        else{
17            return false ;
18        }
19    }
20}