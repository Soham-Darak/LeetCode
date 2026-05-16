class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            sb.append(ch - 'a' + 1);
        }
        int sum = 0;
        String num = sb.toString();

        for(int i = 0; i < k; i++){
            sum = 0;
            for(char ch : num.toCharArray()){
                sum += ch - '0';
            }
            num = String.valueOf(sum);
        }
        return sum;
    }
}