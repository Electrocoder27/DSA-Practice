1class Solution {
2    public String smallestSubsequence(String s) {
3        int[] lastIndex = new int[26];
4        for (int i = 0; i < s.length(); i++) {
5            lastIndex[s.charAt(i) - 'a'] = i; // Track the last index of each char
6        }
7        
8        boolean[] seen = new boolean[26]; // Track characters currently in the stack
9        StringBuilder stack = new StringBuilder();
10        
11        for (int i = 0; i < s.length(); i++) {
12            char c = s.charAt(i);
13            
14            // If we've already included this character, skip it
15            if (seen[c - 'a']) continue;
16            
17            // Greedy pop: if the current char is smaller than the last char in stack,
18            // AND the last char in stack appears again later, pop it.
19            while (stack.length() > 0 && c < stack.charAt(stack.length() - 1) 
20                   && lastIndex[stack.charAt(stack.length() - 1) - 'a'] > i) {
21                seen[stack.charAt(stack.length() - 1) - 'a'] = false;
22                stack.deleteCharAt(stack.length() - 1);
23            }
24            
25            stack.append(c);
26            seen[c - 'a'] = true;
27        }
28        
29        return stack.toString();
30    }
31}