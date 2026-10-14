class Solution {
    public int maximum69Number (int num) {
        if(num == 9 || num == 99 || num == 999 ||num == 9999) return num;
        int max = num;
        String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++){
            char[] chars = str.toCharArray();
            if(chars[i] == '6'){
                chars[i] = '9';
                int curr = Integer.parseInt(new String(chars));
                if(max < curr){
                    max = curr;
                }
            }else if(chars[i] == '9'){
                chars[i] = '6';
                int curr = Integer.parseInt(new String(chars));
                if(max < curr){
                    max = curr;
                }
            }
        }
        return max;
    }
}