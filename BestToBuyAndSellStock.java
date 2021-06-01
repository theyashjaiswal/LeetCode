/* Problem link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
*/

// Intial Approach - BruteForce
class Solution {
    public int maxProfit(int[] prices) {
        int maxProf=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int currProf = prices[j]-prices[i];
                if(maxProf<currProf){
                    maxProf=currProf;
                }
            }
        }
        return maxProf;
    }
}

//optimal approach - oneloop/pass
class Solution {
    public int maxProfit(int[] prices) {
        int minStockPrice = 100000;
        int maxProf = 0;
        for(int i=0;i<prices.length;i++){
            int currProf = prices[i] - minStockPrice;
            if(prices[i] < minStockPrice){
                minStockPrice = prices[i];
            }
            else if(maxProf < currProf){
                maxProf = currProf;
            }
        }
        return maxProf;
    }
}