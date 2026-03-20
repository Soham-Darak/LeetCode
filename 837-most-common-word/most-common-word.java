class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");
        String[] words = paragraph.split("\\s+");
        int maxCount = 0;
        String result = "";
        for(int i = 0 ; i < words.length; i++){
            boolean isBanned = false;
            for (int b = 0; b < banned.length; b++) {
                if (words[i].equals(banned[b])) {
                    isBanned = true;
                    break;
                }
            }
            if (isBanned) continue; 
            int count = 0;
            for(int j = 0;j < words.length; j++){
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                result = words[i];
            }
        }
        return result;
    }
}
