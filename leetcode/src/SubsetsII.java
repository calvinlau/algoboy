import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a collection of integers that might contain duplicates, S, return all possible subsets.
 * 
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,2], a solution is:
 * 
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 * 
 * @author calvinliu
 * @Solution DFS
 *
 */
public class SubsetsII {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		Arrays.sort(nums);
		dfs(0, path, nums, ret);
		return ret;
	}

	private void dfs(int start, List<Integer> path, int[] nums, List<List<Integer>> ret) {
		ret.add(new ArrayList<>(path));
		for (int i = start; i < nums.length; i++) {
			if (i > start && nums[i] == nums[i - 1]) {
				continue;
			}
			path.add(nums[i]);
			dfs(i + 1, path, nums, ret);
			path.remove(path.size() - 1);
		}
	}
}
