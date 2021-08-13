/**
 * Input array is sorted
 * 
 * @author calvinliu
 * @Solution Two pointers from start to end
 * 
 */
public class TwoSuII {

	public static int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return null;
		int i = 0;
		int j = nums.length - 1;

		while (i < j) {
			int x = nums[i] + nums[j];
			if (x < target) {
				i++;
			} else if (x > target) {
				j--;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
		return null;
	}
}
