class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            if(i == n-1){
                if(nums[i] != n-1){
                    return false;
                }
            }
            else if(nums[i] != i+1){
                return false;
            }
        }
       
        return true;
    }
}