/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest product.
 * 
 * For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has
 * the largest product = 6.
 * 
 * @author calvinliu
 * 
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] A) {
    	if (A == null || A.length == 0) return 0;
    	int max = A[0], min = A[0], ret = A[0];
    	for (int i = 1; i < A.length; i++) {
    		int tmp = max;
    		max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
    		min = Math.min(Math.min(tmp * A[i], min * A[i]), A[i]);
    		ret = Math.max(max, ret);
		}
		return ret;
    }
}
