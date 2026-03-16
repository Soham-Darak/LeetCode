class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int left = 0;
        int right = n;
        while(left<n){
            arr.add(nums[left]);
            arr.add(nums[right]);
            left++;
            right++;
        }
        int result[] = new int[2*n];
        for(int i = 0; i < arr.size(); i++){
            result[i] = arr.get(i);
        }
        return result;
    }
}