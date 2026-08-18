class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num , 0)+1);
        }
        int ans = -1;
        for(int i = 0; i < n; i++){
            int curr = map.get(nums[i]);
            if(k == n ||(curr == 1 && ( k == 1 || i == 0 || i == n -1 ))){
                ans = Math.max(ans,nums[i]);
            }
        }
        return ans;
    }
}