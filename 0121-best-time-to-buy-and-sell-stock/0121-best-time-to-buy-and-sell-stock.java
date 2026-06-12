class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxProfit=0;

        //Time Complexity is O(n)

        for(int i=0;i<n;i++){
            min = Math.min(min , prices[i]);
            maxProfit = Math.max(maxProfit , prices[i]-min);
        }
        return maxProfit;
    }
}