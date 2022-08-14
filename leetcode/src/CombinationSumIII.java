import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 216. Combination Sum III
 *
 * Find all possible combinations of k numbers that add up to a number n, given
 * that only numbers from 1 to 9 can be used and each combination should be a
 * unique set of numbers.
 * 
 * Ensure that numbers within the set are sorted in ascending order.
 * 
 * Example 1: Input: k = 3, n = 7 Output: [[1,2,4]]
 * Example 2: Input: k = 3, n = 9 Output: [[1,2,6], [1,3,5], [2,3,4]]
 * 
 * @author kevinliu
 * @Solution DFS
 * 
 */
public class CombinationSumIII {

	public List<List<Integer>> combinationSum(int k, int n) {
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		dfs(1, path, n, k, ret);
		return ret;
	}

	private void dfs(int depth, List<Integer> path, int sum, int k, List<List<Integer>> ret) {
		if (k == path.size() && sum == 0) {
			ret.add(new ArrayList<>(path));
			return;
		}
		for (int i = depth; i < 10 && i <= sum; i++) {
			path.add(i);
			dfs(i + 1, path, sum - i, k, ret);
			path.remove(path.size() - 1);
		}
	}
}
