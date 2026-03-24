class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        while(low <= high){          
            String s = String.valueOf(low);
            int len = s.length();
            int mid = len / 2;
            int sum1 = 0, sum2 = 0;
            if (len % 2 != 0) {
                low++;
                continue;
            }
            for(int i = 0; i < mid; i++){
                sum1 += s.charAt(i) - '0';
            }
            for(int i = mid; i < len; i++){
                sum2 += s.charAt(i) - '0';
            }
            if(sum1 == sum2){
                count++;
            }
            low++;
        }
        return count;
    }
}