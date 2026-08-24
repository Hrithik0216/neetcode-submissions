class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1, max = 0;
        while (i < prices.length && j < prices.length && i < j) {
            int diff = prices[j] - prices[i];
            System.out.println("diff: " + diff + " max: " + max + " i: " + i + " j:" + j);
            if (diff >= max) {
                max = diff;
            } else if (prices[j] < prices[i]) {
                i = j;
            }
            j++;
        }
        return max;
    }
}
