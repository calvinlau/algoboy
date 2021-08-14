/**
 * Given a positive integer n, find the least number of perfect square numbers
 * (for example, 1, 4, 9, 16, ...) which sum to n.
 * 
 * For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13,
 * return 2 because 13 = 4 + 9.
 * 
 * @author calvinliu
 * @Solution DP
 * 
 */
public class PerfectSquares {

	public int numSquares(int n) {
		int[] dp = new int[n + 1];
		for (int i = 0; i < n + 1; i++)
			dp[i] = Integer.MAX_VALUE;
		for (int i = 1; i < n + 1; i++) {
			int sqrt = (int) Math.sqrt(i);
			if (i == sqrt * sqrt) {
				dp[i] = 1;
				continue;
			}
			for (int j = 1; j <= sqrt; j++) {
				if (dp[i - j * j] + 1 < dp[i])
					dp[i] = dp[i - j * j] + 1;
			}
		}
		return dp[n];
	}
}
