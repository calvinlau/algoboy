package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * @author kevinliu
 * @Solution HashMap storing
 * 
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] ret = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				ret[0] = map.get(target - nums[i]);
				ret[1] = i;
				break;
			}
			map.put(nums[i], i);
		}
		return ret;
	}
}
