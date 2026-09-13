1class Solution {
2    public int reversePairs(int[] nums) {
3        if (nums == null || nums.length < 2) return 0;
4        return mergeSort(nums, 0, nums.length - 1);
5    }
6
7    private int mergeSort(int[] nums, int left, int right) {
8        if (left >= right) return 0;
9
10        int mid = left + (right - left) / 2;
11        int count = 0;
12
13        // Count pairs in left half and right half recursively
14        count += mergeSort(nums, left, mid);
15        count += mergeSort(nums, mid + 1, right);
16
17        // Count cross pairs between left and right halves
18        count += countPairs(nums, left, mid, right);
19
20        // Merge two sorted halves
21        merge(nums, left, mid, right);
22
23        return count;
24    }
25
26    // --- LOGIC FOR COUNT PAIRS ---
27    private int countPairs(int[] nums, int left, int mid, int right) {
28        int count = 0;
29        int j = mid + 1;
30
31        for (int i = left; i <= mid; i++) {
32            // Move pointer j in right half as long as condition holds
33            while (j <= right && (long) nums[i] > 2L * nums[j]) {
34                j++;
35            }
36            // All elements from mid + 1 up to j - 1 satisfy nums[i] > 2 * nums[j]
37            count += (j - (mid + 1));
38        }
39
40        return count;
41    }
42
43    // Standard merge operation
44    private void merge(int[] nums, int left, int mid, int right) {
45        int n1 = mid - left + 1;
46        int n2 = right - mid;
47
48        int[] L = new int[n1];
49        int[] R = new int[n2];
50
51        for (int i = 0; i < n1; i++) L[i] = nums[left + i];
52        for (int j = 0; j < n2; j++) R[j] = nums[mid + 1 + j];
53
54        int i = 0, j = 0, k = left;
55
56        while (i < n1 && j < n2) {
57            if (L[i] <= R[j]) {
58                nums[k++] = L[i++];
59            } else {
60                nums[k++] = R[j++];
61            }
62        }
63
64        while (i < n1) nums[k++] = L[i++];
65        while (j < n2) nums[k++] = R[j++];
66    }
67}