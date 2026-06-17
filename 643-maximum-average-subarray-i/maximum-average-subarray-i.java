class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window = 0;
        for(int i = 0; i < k; i++){
            window += nums[i];
        }
        int max = window;
        for(int i = k; i < nums.length;i++){
            window = window - nums[i - k] + nums[i];
            max = Math.max(window,max);
        }
        return (double) max/k;
    }
}