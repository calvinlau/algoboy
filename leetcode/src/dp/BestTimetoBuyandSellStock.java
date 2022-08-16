package dp;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *
 * @author kevinliu
 * @solution DP, store min, and calculate the max profit by O(N)
 *
 */
public class BestTimetoBuyandSellStock {

	// O(N)time
	// O(1)space
	public int maxProfit(int[] prices) {
		int ret = 0;
		int min = Integer.MAX_VALUE;
		for (int price : prices) {
			min = Math.min(min, price);
			ret = Math.max(ret, price - min);
		}
		return ret;
	}
}
