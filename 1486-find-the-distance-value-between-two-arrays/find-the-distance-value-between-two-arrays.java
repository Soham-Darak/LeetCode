class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // Step 1: Sort arr2 to enable binary search -> O(m log m)
        Arrays.sort(arr2);
        int count = 0;

        // Step 2: Binary search for each element in arr1 -> O(n log m)
        for (int val : arr1) {
            if (isValid(arr2, val, d)) {
                count++;
            }
        }

        return count;
    }

    private boolean isValid(int[] arr, int target, int d) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If we find any element within the invalid range, it's not valid
            if (Math.abs(arr[mid] - target) <= d) {
                return false;
            }

            // Move closer to the target
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return true;
    }
}
