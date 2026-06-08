class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][1];
        int ans = events[0][0];

        for(int i = 1; i < events.length; i++){
            
            int time = events[i][1] - events[i - 1][1];
            int button = events[i][0];

            if(time > max){
                max = time;
                ans = button;
            }else if(time == max){
                ans = Math.min(ans,button);
            }
        }
        return ans;
    }
}