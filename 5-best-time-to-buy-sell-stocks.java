class Solution {
    public int maxProfit(int[] prices) {
        //take starting profit as 0
        int profit = 0;
        //set a buy variable for the prise you bought
        int buy = prices[0];
        //initiate a loop to find the max profit start ith 1 because 0th is already the buying price
        for(int i = 1; i< prices.length; i++){
            //first check the max between the present prifit which initially 0,
            //the compare with the current price - the buying price and store the max  
            profit = Math.max(profit,prices[i]-buy);
            //this is useful to check if ever prices index is less than the buy then
            //update the buy
            if(prices[i]<buy){
                buy=prices[i];
            }
        }
        return profit;
    }
}