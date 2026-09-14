class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Ensure mid is even for comparison
            if (mid % 2 == 1) {
                mid--;
            }
              
            // Check the pair
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // Move right
            } else {
                right = mid; // Move left
            }
        }
        return nums[left];
    }

}