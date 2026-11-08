class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";

        char[] hexDigit = "0123456789abcdef".toCharArray();
        StringBuilder hex = new StringBuilder();

        while(num != 0){
            int remainder = num & 15;
            hex.insert(0,hexDigit[remainder]);
            num >>>= 4;
        }
        return hex.toString();
    }
}