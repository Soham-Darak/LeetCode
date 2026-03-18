class Solution {
    public String capitalizeTitle(String title) {
        char[] arr = title.toLowerCase().toCharArray();
        int i = 0;
        while(i < arr.length){
            int start = i;
            int length = 0;
            while(i < arr.length && arr[i] != ' '){
                i++;
                length++;
            }
            if(length > 2){
                arr[start] = Character.toUpperCase(arr[start]);
            }
            while (i < arr.length && arr[i] == ' ') {
                i++;
            }
        }
        return new String(arr);
    }
}