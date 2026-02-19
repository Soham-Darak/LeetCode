class Solution {
    public boolean isPowerOfFour(int n) {
    
        for(int i = 0 ; i <= 15; i++){
            if(n == Math.pow(4,i)){
                return true;
            }
            if(Math.pow(4,i) > n){
                return false;
            }
        }
        return false;
    }
}