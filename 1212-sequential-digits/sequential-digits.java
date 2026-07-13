class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i < 10; i++){
            for(int j = 0; j <= s.length() - i; j++){
                int digit = Integer.parseInt(s.substring(j, j + i));
                if(digit >= low && digit <= high){
                    list.add(digit);
                }
            }
        }
        return list;
    }
}