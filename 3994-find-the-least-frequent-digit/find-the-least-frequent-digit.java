class Solution {
    public int getLeastFrequentDigit(int n) {
        String str = String.valueOf(n);
        int len = str.length();
        int[] freq = new int[10];
        for(int i = 0; i < len; i++){
            int digit = str.charAt(i) - '0';
            freq[digit]++;
        }
        int leastfreq = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                if(freq[i] < min){
                    min = freq[i];
                    leastfreq = i;
                }
            }
        }
        return leastfreq;
    }
}