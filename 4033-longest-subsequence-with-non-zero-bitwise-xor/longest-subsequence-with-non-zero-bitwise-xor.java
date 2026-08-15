class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int x = 0;
        for(int i : nums) x^= i;
        if(x != 0) return n;

        for(int i : nums){
            if(i != 0) return n-1;
        }
        return 0;
    }
}