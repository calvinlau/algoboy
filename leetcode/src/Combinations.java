import java.util.ArrayList;
import java.util.List;

/**
 * 77. Combinations
 *
 * Given two integers n and k, return all possible combinations of k numbers out
 * of 1 ... n.
 * 
 * For example, If n = 4 and k = 2, a solution is:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * @author kevinliu
 * @Solution DFS
 * 
 */
public class Combinations {

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		dfs(1, ret, path, n, k);
		return new ArrayList<List<Integer>>(ret);
	}

	private void dfs(int depth, List<List<Integer>> ret, List<Integer> path, int n, int k) {
		if (path.size() == k) {
			ret.add(new ArrayList<Integer>(path));
			return;
		}
		for (int i = depth; i <= n - (k - path.size()) + 1; i++) {
			path.add(i);
			dfs(i + 1, ret, path, n, k);
			path.remove(path.size() - 1);
		}
	}
}
