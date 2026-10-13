class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] square = new long[n];

        for(int i = 0; i < n; i++){
            long val = nums[i];
            square[i] = val * val;
        }
        Arrays.sort(square);

        int neg = n/2;
        long max = 0;

        for(int i = 0; i < n; i++){
            if(i < neg){
                max -= square[i];
            }else{
                max += square[i];
            }
        }

        return max;
    }
}