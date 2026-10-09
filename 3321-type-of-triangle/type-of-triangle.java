class Solution {
    public String triangleType(int[] nums) {
        boolean isValid = false;
        if(nums[0] + nums[1] > nums[2] && nums[1] + nums[2] > nums[0] && nums[0] + nums[2] > nums[1]){
            isValid = true;
        }
        if(nums[0] == nums[1] && nums[1] == nums[2] && nums[0] == nums[2] && isValid){
            return "equilateral";
        }
        else if((nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) && isValid){
            return "isosceles";
        }
        else if((nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]) && isValid){
            return "scalene";
        }
        return "none";
    }
}