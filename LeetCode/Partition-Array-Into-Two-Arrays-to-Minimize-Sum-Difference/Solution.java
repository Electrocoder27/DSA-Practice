1class Solution {
2    public int minimumDifference(int[] nums) {
3        int n = nums.length / 2;
4        int total = 0;
5        for (int num : nums) total += num;
6
7        // split into 2 halves
8        int[] left = Arrays.copyOfRange(nums, 0, n);
9        int[] right = Arrays.copyOfRange(nums, n, 2 * n);
10
11        // store all subset sums grouped by size
12        List<List<Integer>> leftSums = getAllSums(left);
13        List<List<Integer>> rightSums = getAllSums(right);
14
15        // sort right sums for binary search
16        for (List<Integer> lst : rightSums) Collections.sort(lst);
17
18        int ans = Integer.MAX_VALUE;
19
20        // try all splits
21        for (int k = 0; k <= n; k++) {
22            for (int s1 : leftSums.get(k)) {
23                int target = total / 2 - s1;
24
25                List<Integer> list = rightSums.get(n - k);
26
27                int idx = Collections.binarySearch(list, target);
28                if (idx < 0) idx = -idx - 1;
29
30                if (idx < list.size()) {
31                    int s2 = list.get(idx);
32                    int picked = s1 + s2;
33                    int other = total - picked;
34                    ans = Math.min(ans, Math.abs(picked - other));
35                }
36                if (idx > 0) {
37                    int s2 = list.get(idx - 1);
38                    int picked = s1 + s2;
39                    int other = total - picked;
40                    ans = Math.min(ans, Math.abs(picked - other));
41                }
42            }
43        }
44        return ans;
45    }
46    private List<List<Integer>> getAllSums(int[] arr) {
47        int n = arr.length;
48        List<List<Integer>> res = new ArrayList<>();
49        for (int i = 0; i <= n; i++) res.add(new ArrayList<>());
50
51        for (int mask = 0; mask < (1 << n); mask++) {
52            int sum = 0, bits = 0;
53            for (int j = 0; j < n; j++) {
54                if ((mask & (1 << j)) != 0) {
55                    sum += arr[j];
56                    bits++;
57                }
58            }
59            res.get(bits).add(sum);
60        }
61        return res;
62    }
63}
64