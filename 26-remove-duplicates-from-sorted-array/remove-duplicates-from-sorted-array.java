class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> Hash = new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i++){
            Hash.add(nums[i]);
        }
        int index = 0;
        for(int val : Hash){
            nums[index] = val;
            index++;
        }

        return Hash.size();
    }
}