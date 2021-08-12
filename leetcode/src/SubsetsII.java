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
		Arrays.sort(nums);
		Set<List<Integer>> ret = new HashSet<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		dfs(ret, path, nums, 0);
		return new ArrayList<List<Integer>>(ret);
	}

	private void dfs(Set<List<Integer>> ret, List<Integer> path, int[] nums, int start) {
		List<Integer> tmp = new ArrayList<Integer>(path);
		if (!ret.contains(tmp)) {
			ret.add(tmp);
		}
		for (int i = start; i < nums.length; i++) {
			path.add(nums[i]);
			dfs(ret, path, nums, i + 1);
			path.remove(path.size() - 1);
		}
	}
}
