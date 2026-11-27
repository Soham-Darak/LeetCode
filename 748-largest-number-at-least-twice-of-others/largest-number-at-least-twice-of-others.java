class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        for(int num : nums){
            max = Math.max(num,max);
        }
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                a = i;
            }
            if(nums[i] != max){
                if(nums[i] * 2 > max){
                    return -1;
                }
            }
        }
        return a;
    }
}