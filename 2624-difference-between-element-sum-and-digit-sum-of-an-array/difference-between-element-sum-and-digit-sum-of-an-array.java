class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;
        for(int num : nums){
            eleSum += num;
            while(num > 0){
                int digit = num % 10;
                digitSum += digit;
                num /= 10;
            }
        }
        return Math.abs(eleSum - digitSum);
    }
}