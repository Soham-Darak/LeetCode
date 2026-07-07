class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int digit = n % 10;
            if(digit != 0){
                sb.append(digit);
                sum += digit;
            }
            n = n / 10;
        }
        if (sb.length() == 0) {
            return 0;
        }
        sb.reverse();
        long x = Long.parseLong(sb.toString());
        long result = (long) sum * x;
        return result;
    }
}