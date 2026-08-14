class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int left = 0;
        int maxLen = 0;
        for(int i = 0; i< s.length(); i++){
            int curr = s.charAt(i);
            ++freq[curr - 'a'];

            while(freq[curr - 'a'] > 2){
                --freq[s.charAt(left++) - 'a'];
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}