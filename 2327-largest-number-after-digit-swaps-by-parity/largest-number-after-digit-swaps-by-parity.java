class Solution {
    public int largestInteger(int num) {
        char[] digit = String.valueOf(num).toCharArray();
        for(int i = 0; i < digit.length; i++){
            for(int j = i+1; j < digit.length; j++){
                if((digit[i] - digit[j]) % 2 == 0  && digit[j] > digit[i]){
                    char temp = digit[i];
                    digit[i] = digit[j];
                    digit[j] = temp;
                }
            }
        }
        return Integer.parseInt(new String(digit));
    }
}