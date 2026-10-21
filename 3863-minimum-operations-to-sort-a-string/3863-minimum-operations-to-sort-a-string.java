public class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // Check if string is already sorted
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            return 0;
        }

        if (n == 2) {
            return -1;
        }

        // Find min and max characters in the entire string
        char minChar = s.charAt(0);
        char maxChar = s.charAt(0);
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (c < minChar) minChar = c;
            if (c > maxChar) maxChar = c;
        }

        if (s.charAt(0) == minChar || s.charAt(n - 1) == maxChar) {
            return 1;
        }

        // Find min and max characters in the middle substring (from index 1 to n - 2)
        char maxMid = s.charAt(1);
        char minMid = s.charAt(1);
        for (int i = 2; i < n - 1; i++) {
            char c = s.charAt(i);
            if (c > maxMid) maxMid = c;
            if (c < minMid) minMid = c;
        }

        if (s.charAt(0) > maxMid && s.charAt(n - 1) < minMid) {
            return 3;
        }

        return 2;
    }
}