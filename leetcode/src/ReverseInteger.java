/**
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321 Example2: x = -123, return -321
 * 
 * @author calvinliu
 * @solution
 * 
 */
public class ReverseInteger {

	public int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			if (rev != 0 && Integer.MAX_VALUE / rev < 10 && Integer.MAX_VALUE / rev > -10)
				return 0;
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return rev;
	}
}
