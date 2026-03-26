class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                arr.add(nums[i]);
            }
        }
        int result[] = new int [arr.size()];
        for(int i = 0; i < result.length;i++){
            result[i] = arr.get(i);
        }
        return result;
    }
}