class Solution {
    public int reverse(int x) {
        boolean isNegative = x<0;
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs((long)x)));
        sb.reverse();
        long result = Long.parseLong(sb.toString());
        if(result > Integer.MAX_VALUE){
            return 0;
        }
        return isNegative ? (int)-result : (int)result;
    }
}