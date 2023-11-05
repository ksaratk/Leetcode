class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int i = 0;
        int j = prices.length-1;
        while(i<=j){
            if(prices[i]<min){
                min = prices[i];
            } else{
                profit += prices[i] - min;
                min = prices[i];
            }
            i++;
        }
        return profit;
    }
}


