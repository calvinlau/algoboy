/**
 * Write a program to find the nth super ugly number.
 * 
 * Super ugly numbers are positive numbers whose all prime factors are in the
 * given prime list primes of size k. For example, [1, 2, 4, 7, 8, 13, 14, 16,
 * 19, 26, 28, 32] is the sequence of the first 12 super ugly numbers given
 * primes = [2, 7, 13, 19] of size 4.
 * 
 * Note: 
 * (1) 1 is a super ugly number for any given primes. 
 * (2) The given numbers in primes are in ascending order. 
 * (3) 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.
 * 
 * @author calvinliu
 * 
 */
public class UglyNumberSuper {

	public int nthSuperUglyNumber(int n, int[] primes) {
		int size = primes.length;
		if (n == 0 || primes == null || size == 0)
			return 0;
		int[] indexs = new int[size], vals = new int[size], dp = new int[n];
		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < primes.length; j++)
				vals[j] = dp[indexs[j]] * primes[j];

			dp[i] = getLayerMin(vals);
			for (int k = 0; k < primes.length; k++)
				if (dp[i] == vals[k])
					indexs[k] = indexs[k] + 1;
		}
		return dp[n - 1];
	}

	private int getLayerMin(int[] vals) {
		int min = vals[0];
		for (int i = 1; i < vals.length; i++)
			min = Math.min(vals[i], min);
		return min;
	}
}
