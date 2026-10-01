1class Solution {
2    public boolean isValid(String s) {
3        Stack <Character> st = new  Stack<>() ;
4        for(int i =0;i<s.length();i++){
5            char ch = s.charAt(i) ;
6            if(ch == '(' || ch =='{' || ch == '['){
7                st.push(ch) ;
8            }
9            else{
10                //closing
11                if(st.isEmpty()){
12                    return false ;
13                }
14                if(st.peek() =='(' && ch == ')' ||
15                  st.peek() =='{' && ch == '}' ||
16                  st.peek() =='[' && ch == ']'){
17                    st.pop() ;
18                }
19                else{
20                    return false ;
21                }
22            }
23        }
24        if(st.isEmpty()){
25            return true ;
26        }
27        else{
28            return false ;
29        }
30    }
31}