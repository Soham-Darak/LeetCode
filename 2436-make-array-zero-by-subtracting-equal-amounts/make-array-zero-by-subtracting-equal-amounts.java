class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for(int num : nums){
            if(num != 0){
                hash.add(num);
            }
        }
        return hash.size();
    }
}