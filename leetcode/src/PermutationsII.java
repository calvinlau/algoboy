import java.util.*;

/**
 * Given a collection of numbers that might contain duplicates, return all
 * possible unique permutations.
 * 
 * For example,
 * [1,1,2] have the following unique permutations:
 * [1,1,2], [1,2,1], and [2,1,1].
 *
 * @author calvinliu
 * @solution dfs
 * 
 */
public class PermutationsII {

	public List<List<Integer>> permuteUnique(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		Arrays.sort(nums);
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
			if (!path.contains(nums[i])) {
				if (i > 0 && nums[i] == nums[i - 1]) {
					return;
				}
				path.add(nums[i]);
				dfs(path, nums, ret);
				path.remove(path.size() - 1);
			}
		}
	}

	public List<List<Integer>> permuteUnique_2(int[] nums) {
		Set<List<Integer>> ret = new HashSet<>();
		List<Integer> path = new ArrayList<>();
		boolean[] flag = new boolean[nums.length];
		dfs(ret, path, nums, flag);
		return new ArrayList<>(ret);
	}

	private void dfs(Set<List<Integer>> ret, List<Integer> path, int[] num, boolean[] flag) {
		if (path.size() == num.length) {
			List<Integer> tmp = new ArrayList<>(path);
			ret.add(tmp);
		}
		for (int i = 0; i < num.length; i++) {
			if (!flag[i]) {
				flag[i] = true;
				path.add(num[i]);
				dfs(ret, path, num, flag);
				path.remove(path.size() - 1);
				flag[i] = false;
			}
		}
	}
}
