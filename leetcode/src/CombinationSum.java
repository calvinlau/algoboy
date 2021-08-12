import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
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
 * @author calvinliu
 * @Solution DFS
 * 
 */
public class CombinationSum {
	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		Arrays.sort(candidates);
		dfs(0, path, target, candidates, ret);
		return ret;
	}

	private void dfs(int start, List<Integer> path, int target, int[] candidates, List<List<Integer>> ret) {
		if (target == 0) {
			ret.add(new ArrayList<>(path));
			return;
		}
		for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
			path.add(candidates[i]);
			dfs(i, path, target - candidates[i], candidates, ret);
			path.remove(path.size() - 1);
		}
	}
}
