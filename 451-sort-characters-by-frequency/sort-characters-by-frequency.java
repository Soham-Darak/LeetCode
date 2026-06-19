class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        //List<Map.Enter<Character,Integer>> list = new ArrayList<>(map.enterSet());

        list.sort((a,b)-> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character,Integer> enter: list){
            char ch = enter.getKey();
            int count = enter.getValue();

            while(count --> 0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}