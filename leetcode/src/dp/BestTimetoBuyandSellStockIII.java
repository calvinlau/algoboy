package dp;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete at most two
 * transactions.
 * 
 * Note: You may not engage in multiple transactions at the same time (ie, you
 * must sell the stock before you buy again).
 * 
 * @author calvinliu
 * 
 */
public class BestTimetoBuyandSellStockIII {

	public int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1)
			return 0;
		int[] l2r = new int[prices.length];
		int[] r2l = new int[prices.length];
		int min = prices[0], max = prices[prices.length - 1];
		for (int i = 1; i < prices.length; i++) {
			l2r[i] = Math.max(l2r[i - 1], prices[i] - min);
			min = Math.min(min, prices[i]);
		}
		for (int i = prices.length - 2; i >= 0; i--) {
			r2l[i] = Math.max(r2l[i + 1], max - prices[i]);
			max = Math.max(max, prices[i]);
		}
		int ret = l2r[prices.length - 1];
		for (int i = 0; i < prices.length - 1; i++) {
			ret = Math.max(ret, l2r[i] + r2l[i + 1]);
		}
		return ret;
	}
}

