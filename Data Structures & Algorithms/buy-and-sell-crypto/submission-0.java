class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;

        int sol = 0;


        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                sol = Math.max(prices[r] - prices[l],sol);
            } else {
                l = r;
            }

            r++;

        }

        return sol;
    }
}
