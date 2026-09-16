class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        
        int sort[] = nums.clone();
        Arrays.sort(sort);

        int start = 0;
        while(start < n && nums[start] == sort[start]){
            start++;
        }
        int end = n -1;
        while(end > start && nums[end] == sort[end]){
            end--;
        }
        return end - start + 1;
    }
}