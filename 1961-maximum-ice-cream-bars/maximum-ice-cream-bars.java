class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum = 0;
        int j = 0;
        Arrays.sort(costs);
        for(int i = 0; i < costs.length;i++){
           
            if(sum + costs[i] <= coins){
                sum += costs[i];
                j++;
            }
            else{
                break;
            }
        }
        return j;
    }
}