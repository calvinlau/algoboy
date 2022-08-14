import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum
 *
 * Given a set of candidate numbers (C) and a target number (T), find all unique
 * combinations in C where the candidate numbers sums to T.
 * 
 * The same repeated number may be chosen from C unlimited number of times.
 * 
 * Note: All numbers (including target) will be positive integers. Elements in a
 * combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤
 * … ≤ ak). The solution set must not contain duplicate combinations. 
 * 
 * For example, given candidate set 2,3,6,7 and target 7, 
 * 
 * A solution set is: 
 * [7] 
 * [2, 2, 3]
 * 
 * @author kevinliu
 * @Solution DFS
 * 
 */
public class CombinationSum {
	
    public List<List<Integer>> combinationSum(int[] nums, int target) {
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		Arrays.sort(nums);
		dfs(0, path, target, nums, ret);
		return ret;
	}

	private void dfs(int depth, List<Integer> path, int target, int[] nums, List<List<Integer>> ret) {
		if (target == 0) {
			ret.add(new ArrayList<>(path));
			return;
		}
		for (int i = depth; i < nums.length && nums[i] <= target; i++) {
			path.add(nums[i]);
			dfs(i, path, target - nums[i], nums, ret);
			path.remove(path.size() - 1);
		}
	}
}
