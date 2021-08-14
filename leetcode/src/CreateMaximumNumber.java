/**
 * Given two arrays of length m and n with digits 0-9 representing two numbers.
 * Create the maximum number of length k <= m + n from digits of the two. The
 * relative order of the digits from the same array must be preserved. Return an
 * array of the k digits. You should try to optimize your time and space
 * complexity.
 * 
 * Example 1: 
 * nums1 = [3, 4, 6, 5] 
 * nums2 = [9, 1, 2, 5, 8, 3] 
 * k = 5 
 * return [9, 8, 6, 5, 3]
 * 
 * @author calvinliu
 * @Solution DP Function: f[i] = Min(f[i], f[i - coin[j] + 1]);
 * 
 */
public class CreateMaximumNumber {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
		return nums2;
    }
}
