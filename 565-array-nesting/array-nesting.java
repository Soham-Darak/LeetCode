class Solution {
    public int arrayNesting(int[] nums) {
        
        int n = nums.length;
        int maxcount = 0;
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                ArrayList<Integer> arr = new ArrayList<>();
                int k = i;
                while(!visited[k]){
                    visited[k] = true;
                    arr.add(nums[k]);
                    k = nums[k];
                }
                if(arr.size() > maxcount){
                    maxcount = arr.size();
                }
            }
        }
        return maxcount;
    }
}