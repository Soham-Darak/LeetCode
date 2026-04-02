class Solution {
    public int maxScore(String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        int max = 0;
        int count0 = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == 0){
                count0++;
            }
            int count1 = 0;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] == 1){
                    count1++;
                }
            }
            int sum = count1 + count0;
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}