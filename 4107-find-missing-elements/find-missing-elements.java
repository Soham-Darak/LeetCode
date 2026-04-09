class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = nums[0]; i < nums[nums.length-1]; i++){
            if(j < nums.length && nums[j] == i){
                j++;
            }else{
                arr.add(i);
            }
        }
        return arr;
    }
}