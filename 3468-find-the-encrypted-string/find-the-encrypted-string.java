class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            int index = (i+k) % n;
            sb.append(s.charAt(index));
        }
        return sb.toString();
    }
}