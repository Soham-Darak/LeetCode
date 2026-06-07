class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length == 1) return false;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < deck.length; i++){
            int count = 0;
            for(int j = 0; j < deck.length; j++){
                if(deck[i] == deck[j]){
                    count++;
                }
            }
            list.add(count);
        }
        int gcd = list.get(0);
        for(int num : list){
            gcd = findGCD(gcd,num);
        }
        return gcd >= 2;
    }
    public int findGCD(int a,int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}