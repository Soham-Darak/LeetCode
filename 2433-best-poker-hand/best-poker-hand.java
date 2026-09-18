class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean a = true;
        for(int i = 0; i < suits.length; i++){
            if(suits[i] != suits[0]){
                a = false;
            }
        }
        if(a){
            return "Flush";
        }
        HashMap<Integer,Integer> map =new HashMap<>();
        int freq = 0;
        for(int rank : ranks){
            map.put(rank, map.getOrDefault(rank,0)+1);
            freq = Math.max(freq,map.get(rank));
        }
        if(freq >= 3){
            return "Three of a Kind";
        }
        if(freq == 2){
            return "Pair";
        }
        return "High Card";
    }
}