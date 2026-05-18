class Solution {
    public int countWords(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        for(String word1 : words1){
            int count1 = 0;
            int count2 = 0;

            for(String w1 : words1){
                if(word1.equals(w1)){
                    count1++;
                }
            }

            for(String w2 : words2){
                if(word1.equals(w2)){
                    count2++;
                }
            }
            
            if(count1 == 1 && count2 == 1){
                result.add(word1);
            }
            
        }
        return result.size();
    }
}