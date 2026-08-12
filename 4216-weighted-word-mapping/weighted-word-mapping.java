class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < 26; i++){
            map.put(i, (char) ('z'- i));
        }

        StringBuilder result = new StringBuilder();
        for(String word :  words){
            int weight = 0;
            for(char ch : word.toCharArray()){
                weight += weights[ch - 'a']; 
            }
            int remainder = weight % 26;
            result.append(map.get(remainder));
        }
        return result.toString();
    }
}