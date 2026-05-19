class Solution {
    public boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;

        for(int i = 0 ; i < num.length(); i++){
            int digit = num.charAt(i) - '0';
            if((i+1)%2 != 0){
                odd += digit;
            }
            else{
                even += digit;
            }
        }
        if(odd == even) return true;
        return false;
    }
}