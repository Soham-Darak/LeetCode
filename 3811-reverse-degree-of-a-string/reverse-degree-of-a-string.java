class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map1 = new HashMap();
        for(char ch = 'z'; ch >= 'a'; ch--){
            map1.put(ch, 'z' - ch + 1);
        }
        
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int currPos = i+1;
            sum += map1.get(ch) * currPos; 
            
        } 
        return sum;
    }
}