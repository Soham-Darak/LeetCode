class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10) return false;
        int a = 10;
        boolean AliceTurn = true;
        while(a > 0){
            if(n - a < 0){
                return !AliceTurn;
            }
            n = n - a;
            a--;
            AliceTurn = !AliceTurn;
        }
        return false;
    }
}