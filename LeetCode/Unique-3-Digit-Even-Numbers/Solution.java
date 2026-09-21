1class Solution {
2    public int totalNumbers(int[] digits) {
3        // Step 1: Count frequency of available digits
4        int[] freq = new int[10];
5        for (int d : digits) {
6            freq[d]++;
7        }
8
9        int count = 0;
10
11        // Step 2: Iterate through all possible 3-digit even numbers (100 to 998)
12        for (int num = 100; num <= 998; num += 2) {
13            int d1 = num / 100;          // Hundreds digit
14            int d2 = (num / 10) % 10;    // Tens digit
15            int d3 = num % 10;           // Units digit
16
17            // Count digit frequencies needed for the current candidate number
18            int[] currentFreq = new int[10];
19            currentFreq[d1]++;
20            currentFreq[d2]++;
21            currentFreq[d3]++;
22
23            // Step 3: Check if input digits contain enough copies of d1, d2, and d3
24            if (currentFreq[d1] <= freq[d1] &&
25                currentFreq[d2] <= freq[d2] &&
26                currentFreq[d3] <= freq[d3]) {
27                count++;
28            }
29        }
30
31        return count;
32    }
33}