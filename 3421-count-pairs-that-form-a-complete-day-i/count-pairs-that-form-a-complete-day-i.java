class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0; 
        int[] freq = new int[24];

        for(int h : hours){
            int rem = h % 24;
            int need = (24 - rem) % 24;

            count += freq[need];
            freq[rem]++;
        }
        return count;
    }
}