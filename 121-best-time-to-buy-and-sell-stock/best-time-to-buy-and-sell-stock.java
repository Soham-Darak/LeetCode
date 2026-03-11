class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int price : prices){
            minPrice = Math.min(minPrice,price);
            maxPrice = Math.max(maxPrice, price - minPrice);
        }
        return maxPrice;
        // int n = prices.length;
        // int max = 0;
        // for(int i = 0; i < n; i++){
        //     for(int j = i+1; j < n; j++){
        //         int price = prices[j] - prices[i];
        //         max = Math.max(max, price);
        //     }       
        // }
        // return max;
    }
}