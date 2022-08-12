import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤
 * b ≤ c) The solution set must not contain duplicate triplets. For example,
 * given array S = {-1 0 1 2 -1 -4},
 * 
 * A solution set is: 
 * (-1, 0, 1) 
 * (-1, -1, 2)
 * 
 * @author kevinliu
 * @Solution: 1. Simplify '3sum' to '2sum', using map to store data O(n^2) 
 *            2. Simplify '3sum' to '2sum', sort array firstly, then using two pointer left+right to search. 
 */
public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ret = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int target = -nums[i];
			int l = i + 1, r = nums.length - 1;
			while (l < r) {
				int sum = nums[l] + nums[r];
				if (sum < target) {
					l++;
				} else if (sum > target) {
					r--;
				} else {
					ret.add(Arrays.asList(nums[i], nums[l], nums[r]));
					while (l < r && nums[l] == nums[l + 1]) {
						l++;
					}
					while (l < r && nums[r] == nums[r - 1]) {
						r--;
					}
					l++;
					r--;
				}
			}
		}
		return ret;
	}
}
