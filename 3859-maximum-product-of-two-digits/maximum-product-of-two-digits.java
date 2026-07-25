class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            int digit = n % 10;
            list.add(digit);
            n /= 10;
        }
        int mul = list.get(0);
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                mul = Math.max(list.get(i)*list.get(j), mul);
            }
        }
        return mul;
    }
}