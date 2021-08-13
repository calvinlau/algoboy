import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of numbers, return all possible permutations.
 * 
 * For example, 
 * [1,2,3] have the following permutations: 
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * 
 * @author calvinliu
 * @solution dfs
 * 
 */
public class Permutations {

	public List<List<Integer>> permute(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		List<List<Integer>> ret = new ArrayList<>();
		dfs(new ArrayList<>(), nums, ret);
		return ret;
	}

	private void dfs(List<Integer> path, int[] nums, List<List<Integer>> ret) {
		if (path.size() == nums.length) {
			ret.add(new ArrayList<>(path));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (path.contains(nums[i])) {
				continue;
			}
			path.add(nums[i]);
			dfs(path, nums, ret);
			path.remove(path.size() - 1);
		}
	}
}
