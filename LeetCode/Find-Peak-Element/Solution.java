1    class Solution {
2    public int findPeakElement(int[] nums) {
3        int low = 0, high = nums.length - 1;
4
5        while (low < high) {
6            int mid = low + (high - low) / 2;
7
8            if (nums[mid] > nums[mid + 1]) {
9                // Peak must be on left side (including mid)
10                high = mid;
11            } else {
12                // Peak must be on right side
13                low = mid + 1;
14            }
15        }
16
17        return low;  // or high, both point to a peak
18    }
19}