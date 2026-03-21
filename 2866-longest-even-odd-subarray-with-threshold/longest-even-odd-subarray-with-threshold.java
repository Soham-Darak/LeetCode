class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxLen = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Condition 1: start must be even and <= threshold
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                int len = 1;

                for (int j = i + 1; j < n; j++) {
                    // Check threshold and alternating condition
                    if (nums[j] <= threshold && 
                        nums[j] % 2 != nums[j - 1] % 2) {
                        len++;
                    } else {
                        break;
                    }
                }

                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}