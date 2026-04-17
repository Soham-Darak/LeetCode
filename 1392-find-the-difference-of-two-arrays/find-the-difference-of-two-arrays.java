class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> hash1 = new HashSet<>();
        Set<Integer> hash2 = new HashSet<>();

        for(int x : nums1) hash1.add(x);
        for(int x : nums2) hash2.add(x);

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for(int x : hash1){
            if(!hash2.contains(x)){
                arr1.add(x);
            }
        }
        for(int x : hash2){
            if(!hash1.contains(x)){
                arr2.add(x);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(arr1);
        ans.add(arr2);

        return ans;        
    }
}