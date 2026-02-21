class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
         if(n <= 0) return false;
        for(int i = 1 ; i < 20; i++){
            long x = (long) Math.pow(3,i);
            if(n == x){
                return true;
            }
        }
        return false;
    }
}