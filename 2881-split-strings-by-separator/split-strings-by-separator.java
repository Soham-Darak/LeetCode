class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for(String word : words){
            StringBuilder temp = new StringBuilder();
            for(char ch : word.toCharArray()){
                if(ch == separator){
                    if(temp.length() > 0){
                        result.add(temp.toString());
                        temp.setLength(0);
                    }
                }else{
                    temp.append(ch);
                }
            }
            if(temp.length() > 0){
                result.add(temp.toString());
            }
        }
        return result;
    }
}