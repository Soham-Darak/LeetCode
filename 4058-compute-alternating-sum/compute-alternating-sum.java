class Solution {
    public int alternatingSum(int[] nums) {
        int even = 0, odd = 0;
        for(int i = 0; i<nums.length; i++){
            even += nums[i];
            i++;
        }
        for(int j = 1; j < nums.length; j++){
            odd += nums[j];
            j++;
        }
        return even-odd;
    }
}