1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder result = new StringBuilder("") ;
4        int depth = 0 ;
5        for(char ch: s.toCharArray()){
6            if(ch == '('){
7                if(depth>0){
8                    result.append(ch) ;
9                }
10                depth++ ;
11            }
12            else if(ch == ')') {
13                depth-- ;
14                if(depth>0){
15                    result.append(ch) ;
16                }
17            }
18        }
19        return result.toString() ;
20
21    }
22}