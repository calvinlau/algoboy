package bit;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * @author kevinliu
 * @solution 	two pointer
 */
public class SingleNumber {

	public int singleNumber(int[] nums) {
		int ret = 0;
		for (int num : nums) {
			ret = ret ^ num;
		}
		return ret;
	}
}
