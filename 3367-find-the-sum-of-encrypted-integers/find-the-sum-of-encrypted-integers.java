class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum = sum + encrypt(num);
        }
        return sum;
    }
    public int encrypt(int x){
        String str = String.valueOf(x);
        int len = str.length();

        char max = '0';
        for(int i = 0; i < len; i++){
            if(str.charAt(i) > max){
                max = str.charAt(i);
            }
        }
        String result = String.valueOf(max).repeat(len);
        return Integer.parseInt(result);
    }
}