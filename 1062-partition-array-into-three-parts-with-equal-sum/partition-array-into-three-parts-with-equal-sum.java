class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for(int num : arr){
            total += num;
        }
        if (total %3 != 0) return false;
        int target = total / 3;
        int currentsum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            currentsum += arr[i];
            if (currentsum == target){
            count++;
            currentsum = 0;
            }
        }
        return count >= 3;
    }   
}