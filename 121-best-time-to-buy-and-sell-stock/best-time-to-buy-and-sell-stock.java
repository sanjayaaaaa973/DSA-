class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int buy=prices[0];
        for(int i=0;i<n;i++){
            int cur_profit=prices[i]-buy;
             if(cur_profit>max){
                max=cur_profit;
             }
             if(prices[i]<buy){
                buy=prices[i];
             }
        }
return max;
    }
}