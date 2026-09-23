1class Solution {
2    public int beautySum(String s) {
3        int totalBeautySum = 0;
4        int n = s.length();
5        
6        // Iterate over all substrings
7        for (int i = 0; i < n; i++) {
8            int[] arr = new int[26]; // Frequency array for current substring
9            
10            for (int j = i; j < n; j++) {
11                arr[s.charAt(j) - 'a']++; // Increment frequency for current character
12                
13                // Calculate max and min frequency
14                int max = Integer.MIN_VALUE;
15                int min = Integer.MAX_VALUE;
16                
17                for (int freq : arr) {
18                    if (freq > 0) { // Ignore characters with frequency 0
19                        max = Math.max(max, freq);
20                        min = Math.min(min, freq);
21                    }
22                }
23                
24                totalBeautySum += (max - min); // Add beauty value of this substring
25            }
26        }
27        
28        return totalBeautySum;
29    }
30}
31