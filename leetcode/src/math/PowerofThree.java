package math;

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 *
 * Input: n = 27
 * Output: true
 *
 * Input: n = 0
 * Output: false
 *
 * @author kevinliu
 * @Solution: HashMap for storing
 * 
 */
public class PowerofThree {

	public boolean isPowerOfThree(int n) {
		while (n > 1) {
			if (n % 3 != 0) return false;
			n = n / 3;
		}
		return n == 1;
	}
}
