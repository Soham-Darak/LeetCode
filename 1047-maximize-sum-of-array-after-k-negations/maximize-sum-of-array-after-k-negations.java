class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length && nums[i] < 0 && k > 0){
            nums[i] = -nums[i];
            i++;
            k--;
        }

        if(k % 2 == 1){
            int minIndex = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            nums[minIndex] = -nums[minIndex];
        }
        int total = 0;
        for (int num : nums){
            total += num;
        }
        return total;
    }
}