class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landToWater = minTime(landStartTime,landDuration,waterStartTime,waterDuration);
        int waterToLand = minTime(waterStartTime,waterDuration,landStartTime,landDuration);
        int result = Math.min(landToWater,waterToLand);
        return result;
    }
    public int minTime(int[] start1, int[] duration1, int[] start2, int[] duration2){
        int min1 = Integer.MAX_VALUE;
        for(int i = 0; i < start1.length; i++){
            min1 = Math.min(min1, start1[i]+duration1[i]);
        }

        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i < start2.length; i++){
            int secondStart = Math.max(min1,start2[i]);
            int secondEnd = secondStart + duration2[i];
            min2 = Math.min(secondEnd,min2);
        }
        return min2;
    }
}