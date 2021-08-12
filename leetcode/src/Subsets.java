/**
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
 * @author calvinliu
 * @Solution DFS
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	List<Integer> path = new ArrayList<Integer>();
    	dfs(ret, path, nums, 0);
    	return ret;
    }

	private void dfs(List<List<Integer>> ret, List<Integer> path, int[] nums, int start) {
		ret.add(new ArrayList<Integer>(path));
		for (int i = start; i < nums.length; i++) {
			path.add(nums[i]);
			dfs(ret, path, nums, i + 1);
			path.remove(path.size() - 1);
		}
	}
}
