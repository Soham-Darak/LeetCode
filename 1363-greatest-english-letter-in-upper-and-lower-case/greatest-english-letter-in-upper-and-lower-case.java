class Solution {
    public String greatestLetter(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch = 'z'; ch >= 'a'; ch--){
            if(s.contains(String.valueOf(Character.toUpperCase(ch))) &&
                s.contains(String.valueOf(ch))){
                return String.valueOf(Character.toUpperCase(ch));
            }
        }
        return "";
    }
}