class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n - 1;
        while(i < j){
            int curr_sum = numbers[i] + numbers[j];
            if(curr_sum == target){
                return new int[]{i+1,j+1};
            }else if(curr_sum < target){
                i += 1;
            }else{
                j -= 1;
            }
        }
        return new int[]{};
    }
}