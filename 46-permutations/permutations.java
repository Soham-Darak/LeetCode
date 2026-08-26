class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0 , result);
        return result;
    }
    void permute(int nums[], int index, List<List<Integer>> result){
        if(index == nums.length){
            ArrayList<Integer> temp = new ArrayList<>();

            for(int num : nums){
                temp.add(num);
            }
            result.add(temp);
            return;
        }
        for(int i = index; i < nums.length; i++){
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            permute(nums, index + 1,result);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}