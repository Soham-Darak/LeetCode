class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        for(int i = 0 ;i < 31; i++){
            int x = (int) Math.pow(2,i);
            if(n==x){
                return true;
            }
        }
        return false;
    }
}