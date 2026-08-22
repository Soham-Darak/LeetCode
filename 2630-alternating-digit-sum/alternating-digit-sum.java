class Solution {
    public int alternateDigitSum(int n) {
        int totalSum = 0;
        int sign = 1;
        while(n > 0){
            int digit = n % 10;
            totalSum += sign * digit;
            sign = -sign;
            n /= 10;
        }
        return sign == 1 ? -totalSum : totalSum;    
    }
    
}