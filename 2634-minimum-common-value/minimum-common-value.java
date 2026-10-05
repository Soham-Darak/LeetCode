class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num1 : nums1){
            set.add(num1);
        }
        for(int num2 : nums2){
            if(set.contains(num2)){
                return num2;
            }
        }
        return -1;
    }
}