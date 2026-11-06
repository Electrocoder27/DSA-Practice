class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int num : arr1) {
            if (!hasElementInRange(arr2, num - d, num + d)) {
                count++;
            }
        }
        return count;
    }

    private boolean hasElementInRange(int[] arr, int minVal, int maxVal) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] >= minVal && arr[mid] <= maxVal) {
                return true; 
            } else if (arr[mid] < minVal) {
                l = mid + 1;
            } else {
                r = mid - 1; 
            }
        }

        return false;
    }
}