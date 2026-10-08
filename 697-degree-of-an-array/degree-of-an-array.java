class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        int maxDegree = 0;

        for(int i = 0; i < nums.length; i++){
            first.putIfAbsent(nums[i],i);
            last.put(nums[i],i);
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
            maxDegree = Math.max(maxDegree, count.get(nums[i]));
        }

        int minLength = nums.length;

        for(int num : count.keySet()){
            if(count.get(num) == maxDegree){
                int currentLength = last.get(num) - first.get(num) + 1;
                minLength = Math.min(minLength,currentLength);
            }
        }
        return minLength;
    }
}