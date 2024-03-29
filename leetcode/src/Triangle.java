import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom. Each step you
 * may move to adjacent numbers on the row below.
 * 
 * For example, given the following triangle
 *[
 *     [2],
 *    [3,4],
 *   [6,5,7],
 *  [4,1,8,3]
 *]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * 
 * @author calvinliu
 * @Solution DP Function: f[i][j] = Math.min(f[i + 1][j], f[i + 1][j + 1]) + f[i][j]; return f[0][0]
 * 
 */
public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle == null) {
			return 0;
		}
		for (int i = triangle.size() - 2; i >= 0; --i) {
			List<Integer> cur = triangle.get(i);
			List<Integer> next = triangle.get(i + 1);
			for (int j = 0; j < i + 1; ++j) {
				cur.set(j, Math.min(next.get(j), next.get(j + 1)) + cur.get(j));
			}
		}
		return triangle.get(0).get(0);
	}
}
