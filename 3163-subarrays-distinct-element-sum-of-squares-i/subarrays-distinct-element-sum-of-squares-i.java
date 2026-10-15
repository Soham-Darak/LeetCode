class Solution {
    public int sumCounts(List<Integer> nums) {
        int totalSum = 0;
        int n = nums.size();

        for(int i = 0; i < n; i++){
            HashSet<Integer> hash = new HashSet<>();
            for(int j = i; j < n; j++){
                hash.add(nums.get(j));
                int count = hash.size();
                totalSum += count * count;
            }
        }
        return totalSum;
    }
}