class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            int minCost = Integer.MAX_VALUE;
            for(int j = 0; j <=i; j++){
                if(cost[j] < minCost){
                    minCost = cost[j];
                }
            }
            arr[i] = minCost;
        }
        return arr;
    }
}