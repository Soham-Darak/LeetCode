class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[i] <= nums[i-1]){
                int needed = nums[i-1] + 1 - nums[i];
                count += needed;
                nums[i] = nums[i-1]+1;
            }
        }
        return count;
    }
}