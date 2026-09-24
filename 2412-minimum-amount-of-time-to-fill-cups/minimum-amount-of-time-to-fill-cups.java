class Solution {
    public int fillCups(int[] amount) {
        int max = 0;
        int sum = 0;
        for(int num : amount){
            max = Math.max(num,max);
            sum += num;
        }
        return Math.max(max, (sum+1)/2);
    }
}