import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such
 * that a + b + c + d = target? Find all unique quadruplets in the array which
 * gives the sum of target.
 * 
 * Note: Elements in a quadruplet (a,b,c,d) must be in non-descending order.
 * (ie, a ≤ b ≤ c ≤ d) The solution set must not contain duplicate quadruplets.
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * 
 * A solution set is: (-1, 0, 0, 1) (-2, -1, 1, 2) (-2, 0, 0, 2)
 * 
 * @author calvinliu
 * @Solution: 1. Simplify '4sum' to '2sum', sort array firstly, then using two pointer left+right to search.
 * 
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	if (nums == null || nums.length < 4) {
    		return ret;
    	}
    	Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) continue;
			for (int j = i + 1; j < nums.length; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) continue;
				int l = j + 1, r = nums.length - 1;
				while (l < r) {
					int foursum = nums[i] + nums[j] + nums[l] + nums[r];
					if (foursum > target) {
						r--;
					} else if (foursum < target) {
						l++;
					} else {
						List<Integer> quadruplet = new ArrayList<Integer>();
						quadruplet.add(nums[i]);
						quadruplet.add(nums[j]);
						quadruplet.add(nums[l]);
						quadruplet.add(nums[r]);
						ret.add(quadruplet);
						l++;
						r--;
						while (l < r && nums[l] == nums[l - 1])
							l++;
						while (l < r && nums[r] == nums[r + 1])
							r--;
					}
				}
			}
		}
		return ret;
    }
}
