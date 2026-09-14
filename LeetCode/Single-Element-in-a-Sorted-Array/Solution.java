1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7            
8            // Ensure mid is even for comparison
9            if (mid % 2 == 1) {
10                mid--;
11            }
12            
13            // Check the pair
14            if (nums[mid] == nums[mid + 1]) {
15                left = mid + 2; // Move right
16            } else {
17                right = mid; // Move left
18            }
19        }
20        return nums[left];
21    }
22
23}