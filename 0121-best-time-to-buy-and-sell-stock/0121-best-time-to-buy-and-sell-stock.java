class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE; // Tracks the lowest buy price seen so far
        int maxprofit = 0;               // Tracks our record-high profit
        
        for (int i = 0; i < prices.length; i++) {
            // 1. Update the best (lowest) price to buy at using today's price
            buyprice = Math.min(buyprice, prices[i]);
            
            // 2. Calculate profit if we sell today, and update the max profit
            int profitToday = prices[i] - buyprice;
            maxprofit = Math.max(maxprofit, profitToday);
        }
        
        return maxprofit;
    }
}