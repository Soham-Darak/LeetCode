class Solution {
    public boolean areOccurrencesEqual(String s) {
        ArrayList <Integer> arr = new ArrayList<>();
        boolean[] visited = new boolean[26];
        for(int i = 0; i < s.length(); i++){
            if(!visited[s.charAt(i) - 'a']){
                int count = 0;
                for(int j = i; j < s.length(); j++){
                    if(s.charAt(i) == s.charAt(j)){
                        count++;
                    
                    }
                }
            arr.add(count);
            visited[s.charAt(i) - 'a'] = true; 
            }
        }
        int first = arr.get(0);
        for(int i = 1; i < arr.size();i++){
            if(arr.get(i) != first){
                return false;
            }
        }
        return true;
    }
}