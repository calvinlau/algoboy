/**
 * Given an array of n integers where n > 1, nums, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Solve it without division and in O(n).
 * 
 * For example, given [1,2,3,4], return [24,12,8,6].
 * 
 * @author calvinliu
 * @solution
 * 
 */
public class ProductofArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		result[result.length - 1] = 1;

		for (int i = nums.length - 2; i >= 0; i--) {
			result[i] = result[i + 1] * nums[i + 1];
		}

		int left = 1;
		for (int i = 0; i < nums.length; i++) {
			result[i] *= left;
			left *= nums[i];
		}

		return result;
	}
}
