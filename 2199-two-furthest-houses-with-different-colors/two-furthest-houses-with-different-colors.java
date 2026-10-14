class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        for(int i = 0; i < colors.length; i++){
            int max1 = 0;
            for(int j = i; j < colors.length; j++){
                if(colors[i] != colors[j]){
                    max1 = Math.max(max,Math.abs(i-j));
                }
            }
            max = Math.max(max1,max);
        }
        return max;
    }
}