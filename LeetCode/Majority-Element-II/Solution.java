1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        ArrayList<Integer> res = new ArrayList<>();
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        int n = nums.length / 3;
7
8        // count frequencies
9        for (int i = 0; i < nums.length; i++) {
10            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
11        }
12
13        // find elements with count > n
14        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
15            if (entry.getValue() > n) {
16                res.add(entry.getKey());
17            }
18        }
19
20        return res;
21    }
22}
23