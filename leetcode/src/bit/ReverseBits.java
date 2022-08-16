package bit;

/**
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 *
 * Input: n = 00000000000000000000000000001011
 * Output: 3
 * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 *
 * @author kevinliu
 * @solution
 */
public class ReverseBits {

	public int reverseBits(int n) {
		int ret = 0;
		for (int t = 31; t >= 0; t--) {
			int i = n & 1;
			ret += i << t;
			n = n >> 1;
		}
		return ret;
	}
}
