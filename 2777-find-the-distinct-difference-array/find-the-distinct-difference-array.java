class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            Set<Integer> left = new HashSet<>();
            Set<Integer> right = new HashSet<>();
            for(int j = 0; j <= i ; j++){
                left.add(nums[j]);
            }
            for(int j = i +1; j < n; j++){
                right.add(nums[j]);
            }
            result[i] = left.size() - right.size();
        }
        return result;
    }
}