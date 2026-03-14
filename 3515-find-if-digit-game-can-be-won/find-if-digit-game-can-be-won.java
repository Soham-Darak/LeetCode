class Solution {
    public boolean canAliceWin(int[] nums) {
        int Alice = 0;
        int Bob = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] >=0 && nums[i] <= 9){
                Alice = Alice + nums[i];
            }
            else if(nums[i]>=10 && nums[i]<=99){
                Bob = Bob + nums[i];
            }
        }
        if(Alice > Bob || Bob > Alice){
            return true;
        }
        return false;
    }
}