class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0 ;
        int minbuy = Integer.MAX_VALUE ;
        
        for(int i=0 ; i < prices.length; i++){
             int currentBuy =prices[i];
             if(currentBuy < minbuy){
                minbuy = currentBuy ;
             }
             int profit =  currentBuy - minbuy ;
            if( profit > maxProfit ){
                maxProfit =profit;
            }

        }

      
      return maxProfit ;
    }
}