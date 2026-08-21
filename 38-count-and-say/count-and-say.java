class Solution {
    public String countAndSay(int n) {
        if(n <= 0) return "";

        String curr = "1";

        for(int i = 1; i < n; i++){
            StringBuilder sb = new StringBuilder();
            int len = curr.length();
            int j = 0;

            while(j < len){
                int count = 1;
                while(j + 1 <len && curr.charAt(j) == curr.charAt(j+1)){
                    count++;
                    j++;
                }
                sb.append(count).append(curr.charAt(j));
                j++;
            }
            curr = sb.toString();
        }
        return curr;
    }
}