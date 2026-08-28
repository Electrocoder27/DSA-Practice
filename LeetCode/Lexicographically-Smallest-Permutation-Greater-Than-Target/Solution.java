1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int n = s.length();
4        int[] freq = new int[26];
5        
6        // Count frequencies of characters in s
7        for (char c : s.toCharArray()) {
8            freq[c - 'a']++;
9        }
10        
11        // Try to match target prefix as far as possible
12        int[] count = freq.clone();
13        int matchLen = 0;
14        
15        while (matchLen < n) {
16            char c = target.charAt(matchLen);
17            if (count[c - 'a'] > 0) {
18                count[c - 'a']--;
19                matchLen++;
20            } else {
21                break;
22            }
23        }
24        
25        // Backtrack from matchLen down to 0
26        for (int i = matchLen; i >= 0; i--) {
27            // Re-add target.charAt(i) to the pool if we backtracked from it
28            if (i < matchLen) {
29                count[target.charAt(i) - 'a']++;
30            }
31            
32            if (i < n) {
33                char targetChar = target.charAt(i);
34                // Try picking a strictly larger character than target[i]
35                for (int c = targetChar - 'a' + 1; c < 26; c++) {
36                    if (count[c] > 0) {
37                        StringBuilder sb = new StringBuilder();
38                        
39                        // 1. Append target prefix up to index i-1
40                        sb.append(target.substring(0, i));
41                        
42                        // 2. Append the bumped character
43                        sb.append((char) ('a' + c));
44                        count[c]--;
45                        
46                        // 3. Fill remaining positions with smallest available characters
47                        for (int k = 0; k < 26; k++) {
48                            while (count[k] > 0) {
49                                sb.append((char) ('a' + k));
50                                count[k]--;
51                            }
52                        }
53                        
54                        return sb.toString();
55                    }
56                }
57            }
58        }
59        
60        return "";
61    }
62}