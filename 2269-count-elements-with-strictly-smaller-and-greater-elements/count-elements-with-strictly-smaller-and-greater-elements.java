class Solution {
    public int countElements(int[] nums) {
         int count = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min && nums[i] < max) {
                count++;
            }
        }
        return count;
        // int count = 0;
        // for(int i = 1; i < nums.length-1; i++){
        //     if(nums[0] > nums[1] && nums[0] < nums[nums.length-1]){
        //         count++;
        //     }
        //     else if(nums[0] < nums[1] && nums[0] > nums[nums.length-1]){
        //         count++;
        //     }
        //     else if(nums[i-1] < nums[i] && nums[i+1] > nums[i]){
        //         count++;
        //     }
        //     else if(nums[i-1] > nums[i] && nums[i+1] > nums[i]){
        //         count++;
        //     }        
        // }
        // return count;
    }
}