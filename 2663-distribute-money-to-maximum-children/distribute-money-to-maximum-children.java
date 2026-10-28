class Solution {
    public int distMoney(int money, int children) {
        if(money < children){
            return -1;
        }
        money -= children;
        int count8 = money / 7;
        int remainder = money % 7;

        if(count8 > children || (count8 == children && remainder > 0)){
            return children - 1;
        }
        if(count8 == children && remainder == 0){
            return children;
        }
        if(count8 == children - 1 && remainder == 3){
            return count8 - 1;
        }
        return count8;
    }
}