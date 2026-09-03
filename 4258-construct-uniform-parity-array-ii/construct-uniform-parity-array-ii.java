class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];
        for(int num1 : nums1){
            min = Math.min(num1,min);
        }
        if(min % 2 == 1) return true;
        for(int num1 : nums1){
            if(num1 % 2 == 1) return false;
        }
        return true;
    }
}