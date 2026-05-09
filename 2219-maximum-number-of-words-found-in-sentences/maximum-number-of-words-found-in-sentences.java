class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences){
            String word[] = s.split(" ");
            int count = word.length;
            max = Math.max(max,count);
        }
        return max;
    }
}