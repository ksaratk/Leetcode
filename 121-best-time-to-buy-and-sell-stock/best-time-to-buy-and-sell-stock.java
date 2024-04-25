class Solution {
    public int maxProfit(int[] prices) {
        int min =Integer.MAX_VALUE;
        int maxGain = 0;
            for(int i=0; i<prices.length; i++){
                if(prices[i]<min){
                    min = prices[i];
                } else{
                    maxGain = Math.max(maxGain, prices[i] - min);
                }
        }
        return maxGain;
    }
}