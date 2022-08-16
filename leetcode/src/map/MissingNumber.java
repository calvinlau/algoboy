package map;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 *
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 *
 * @author kevinliu
 * @Solution: HashMap for storing
 * 
 */
public class MissingNumber {

	// O(N)time  O(N)space
	public int missingNumber(int[] nums) {
		int[] count = new int[nums.length + 1];
		for (int i : nums) {
			count[i] = 1;
		}
		int ret = -1;
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 1) {
				ret = i;
				break;
			}
		}
		return ret;
	}

	//O(n)time O(1)space
	public int missingNumber_2(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res ^= nums[i];
			res ^= i + 1;
		}
		return res;
	}
}
