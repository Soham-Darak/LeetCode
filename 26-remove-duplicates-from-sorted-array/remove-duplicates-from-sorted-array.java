class Solution {
    public int removeDuplicates(int[] nums) {
        int m=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[m]=nums[i+1];
                m++;
            }
        }
        return m;
        // LinkedHashSet<Integer> Hash = new LinkedHashSet<>();
        // for(int i = 0; i < nums.length; i++){
        //     Hash.add(nums[i]);
        // }
        // int index = 0;
        // for(int val : Hash){
        //     nums[index] = val;
        //     index++;
        // }

        // return Hash.size();
    }
}