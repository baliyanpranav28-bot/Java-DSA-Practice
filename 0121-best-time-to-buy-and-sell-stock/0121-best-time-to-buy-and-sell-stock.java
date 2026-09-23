class Solution {
    public int maxProfit(int[] prices) {
        // profit = sell-buy
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<=prices.length-1; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;//today profit
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
}