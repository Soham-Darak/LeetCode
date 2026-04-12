class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> arr = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    arr.add(nums1[i]);
                }
            }
            for(int k = 0; k < nums3.length; k++){
                if(nums1[i] == nums3[k]){
                    arr.add(nums1[i]);
                }
            }
        }

        for(int j = 0; j < nums2.length; j++){
            for(int k = 0; k < nums3.length; k++){
                if(nums2[j] == nums3[k]){
                    arr.add(nums2[j]);
                }
            }
        }

        return new ArrayList<>(arr);
    }
}