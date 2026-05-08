class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_buy = Integer.MAX_VALUE;

        for(int i=0; i < prices.length;i++){
            int ct_buy = prices[i];
            if(ct_buy < min_buy){
                min_buy = ct_buy;
            }
            int profit = ct_buy-min_buy;
            if(profit > max_profit){
                max_profit = profit;
            }
        }
        return max_profit;
    }
}