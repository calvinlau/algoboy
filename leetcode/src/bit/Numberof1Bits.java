package bit;

/**
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 *
 * Input: n = 00000000000000000000000000001011
 * Output: 3
 * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 *
 * @author kevinliu
 * @solution 	two pointer
 */
public class Numberof1Bits {

	public int hammingWeight(int n) {
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if (((1 << i) & n) != 0) {
				count++;
			}
		}
		return count;
	}
}
