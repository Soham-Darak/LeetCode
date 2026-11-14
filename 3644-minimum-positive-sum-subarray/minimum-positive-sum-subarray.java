class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for(int k = l; k <= r; k++){
            if(k > n) break;

            int currSum = 0;
            for(int i = 0; i < k; i++){
                currSum += nums.get(i);
            }
            if(currSum > 0){
                minSum = Math.min(minSum, currSum);
            }

            for(int i = k; i < n; i++){
                currSum += nums.get(i) - nums.get(i - k);
                if(currSum > 0){
                    minSum = Math.min(minSum, currSum);
                }
            }
        }

        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}