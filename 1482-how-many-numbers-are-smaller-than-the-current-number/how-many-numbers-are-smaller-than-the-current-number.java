class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            arr.add(count);
        }
        int result[] = new int [arr.size()];
        for(int i = 0; i < arr.size(); i++){
            result[i] = arr.get(i);
        }

        return result;

    }
}