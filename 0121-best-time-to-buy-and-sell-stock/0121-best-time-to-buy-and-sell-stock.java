class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_buy = Integer.MAX_VALUE;
        for(int i =0 ; i < prices.length ; i++){
            int buy = prices[i];
            if( buy < min_buy) {
                min_buy = buy;
            }
            int profit = prices[i] -min_buy ;
            if(profit > max_profit) {
                max_profit = profit;
            }
        }
        return max_profit;
    }
}