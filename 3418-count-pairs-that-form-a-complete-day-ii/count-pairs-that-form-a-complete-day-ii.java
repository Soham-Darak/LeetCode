class Solution {
    public long countCompleteDayPairs(int[] hours) {
        int[] freq = new int[24];
        long count = 0;
        for(int h : hours){
            int rem = h % 24;
            int need = (24 - rem) % 24;

            count += freq[need];
            freq[rem]++;
        }
        return count;
    }
}