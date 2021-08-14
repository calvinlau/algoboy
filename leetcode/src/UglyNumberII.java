/**
 * Write a program to check whether a given number is an ugly number.
 * 
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another
 * prime factor 7.
 * 
 * Note that 1 is typically treated as an ugly number.
 * 
 * @author calvinliu
 * @Solution Uk+1 must be Min(L1 * 2, L2 * 3, L3 * 5).
 */
public class UglyNumberII {

	public int nthUglyNumber(int n) {
		if (n == 1)
			return 1;
		int[] dp = new int[n + 1];
		dp[1] = 1;
		int p2 = 1, p3 = 1, p5 = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = Math.min(2 * dp[p2], Math.min(3 * dp[p3], 5 * dp[p5]));
			if (dp[i] == 2 * dp[p2])
				p2++;
			if (dp[i] == 3 * dp[p3])
				p3++;
			if (dp[i] == 5 * dp[p5])
				p5++;
		}
		return dp[n];
	}
}
