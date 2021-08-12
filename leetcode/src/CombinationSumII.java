import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (C) and a target number (T), find all
 * unique combinations in C where the candidate numbers sums to T.
 * 
 * Each number in C may only be used once in the combination.
 * 
 * Note: All numbers (including target) will be positive integers. Elements in a
 * combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤
 * … ≤ ak). The solution set must not contain duplicate combinations. For
 * example, given candidate set 10,1,2,7,6,1,5 and target 8, 
 * A solution set is: [1, 7] [1, 2, 5] [2, 6] [1, 1, 6]
 * 
 * @author calvinliu
 * @Solution DFS
 * 
 */
public class CombinationSumII {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		Arrays.sort(candidates);
		dfs(0, path, target, candidates, ret);
		return ret;
	}

	private void dfs(int start, List<Integer> path, int target, int[] nums, List<List<Integer>> ret) {
		if (target == 0) {
			ret.add(new ArrayList<>(path));
			return;
		}
		for (int i = start; i < nums.length && nums[i] <= target; i++) {
			if (i != start && nums[i] == nums[i - 1]) {
				continue;
			}
			path.add(nums[i]);
			dfs(i + 1, path, target - nums[i], nums, ret);
			path.remove(path.size() - 1);
		}
	}
}
