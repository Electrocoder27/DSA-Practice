1public class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m - 1;
4        int j = n - 1;
5        int k = m + n - 1;
6
7        while (i >= 0 && j >= 0) {
8            if (nums1[i] > nums2[j]) {
9                nums1[k--] = nums1[i--];
10            } else {
11                nums1[k--] = nums2[j--];
12            }
13        }
14
15        while (j >= 0) {
16            nums1[k--] = nums2[j--];
17        }
18    }
19}
20