package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 78. backtrack.Subsets
 *
 * Given a set of distinct integers, S, return all possible subsets.
 *
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:
 *
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 *
 * @author kevinliu
 * @Solution DFS
 *
 */

public class Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		Arrays.sort(nums);
		dfs(0, path, nums, ret);
		return ret;
	}

	private void dfs(int depth, List<Integer> path, int[] nums, List<List<Integer>> ret) {
		ret.add(new ArrayList<>(path));
		for (int i = depth; i < nums.length; i++) {
			path.add(nums[i]);
			dfs(i + 1, path, nums, ret);
			path.remove(path.size() - 1);
		}
	}
}
