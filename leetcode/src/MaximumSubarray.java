/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * 
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4], the contiguous subarray
 * [4,−1,2,1] has the largest sum = 6.
 * 
 * @author calvinliu
 * @solution DP f[i] = max(f[i], max(num[i], preMax + num[i]))
 * 
 */
public class MaximumSubarray {
	public int maxSubArray(int[] A) {
		if (A == null || A.length == 0) return 0;
		int ret = A[0], sum = A[0];
		for (int i = 1; i < A.length; i++) {
			sum = Math.max(A[i], sum + A[i]);
			ret = Math.max(sum, ret);
		}
		return ret;
	}
}
