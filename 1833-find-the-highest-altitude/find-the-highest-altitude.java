class Solution {
    public int largestAltitude(int[] gain) {
        int max1 = 0;
        int sum = 0;

        for (int g : gain) {
            sum += g;
            max1 = Math.max(max1, sum);
        }
        return max1;
    }
}