/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * @author calvinliu
 * @solution 1. loop, strait away method O(N^2)
 *           2. DP, store min, and calculate the max profit by O(N)
 * 
 */
public class BestTimetoBuyandSellStock {

    public int maxProfit_1(int[] prices) {
    	if (prices == null || prices.length <= 1) return 0;
    	int ret = 0;
    	for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				ret = Math.max(ret, prices[j] - prices[i]);
			}
		}
    	return ret;
    }
    
    public int maxProfit_2(int[] prices) {
    	if (prices == null || prices.length <= 1) return 0;
    	int ret = 0;
    	int min = prices[0];
    	for (int i = 1; i < prices.length; i++) {
			ret = Math.max(ret, prices[i] - min);
			min = Math.min(min, prices[i]);
		}
    	return ret;
    }
}
