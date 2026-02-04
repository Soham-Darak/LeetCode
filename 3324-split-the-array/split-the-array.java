class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int count[] = new int[101];
        for(int i = 0; i< nums.length;i++){
            int currentNum = nums[i];
            count[currentNum]++;
            if(count[currentNum]>2){
                return false;
            }
        }
        return true;
    }
}