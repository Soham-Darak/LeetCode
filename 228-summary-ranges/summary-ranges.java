class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if(nums.length == 0){
            return result;
        }

        int initial = nums[0];
        for(int i = 1; i <= nums.length;i++){
            if(i == nums.length || nums[i] != nums[i -1]+1){
                int end = nums[i - 1];

                if(initial == end){
                    result.add(String.valueOf(initial));
                }
                else{
                    result.add(initial +"->"+ end);
                }
                if(i < nums.length){
                    initial = nums[i];
                }
            }
        }
        return result;
    }
}