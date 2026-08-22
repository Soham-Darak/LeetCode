class Solution {
    public boolean checkDivisibility(int n) {
        if(n <= 0) return false;
        int a = n;
        int sum = 0;
        int prod = 1;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }

        if(a % (sum + prod) == 0) return true;
        return false;
    }
}