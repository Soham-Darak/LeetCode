class Solution {
    public int countDigits(int num) {
        int val = 0;
        String s = Integer.toString(num);
        for(int i = 0; i < s.length();i++){
            int digit = s.charAt(i) - '0';
            if(num % digit == 0){
                val++;
            }
        }
        return val;
    }
}