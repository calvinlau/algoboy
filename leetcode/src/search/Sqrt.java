package search;

/**
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 * 
 * @author kevinliu
 * 
 */
public class Sqrt {

	public int sqrt(int x) {
		if (x <= 1) return x;
		int left = 1, right = x / 2;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (x / mid > mid) {
				left = mid + 1;
			} else if (x / mid < mid) {
				right = mid - 1;
			} else {
				return mid;
			}
		}
		return right;
	}
}
