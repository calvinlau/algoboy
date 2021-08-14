/**
 * Given a m x n grid filled with non-negative numbers, find a path from top
 * left to bottom right which minimizes the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 * @author calvinliu
 * @Solution DP Function: f[i][j] += Min(f[i - 1][j], f[i][j - 1]);
 * 
 */
public class MinimumPathSum {

	public int minPathSum(int[][] map) {
		int m = map.length, n = map[0].length;
		for (int i = 1; i < n; i++) {
			map[0][i] += map[0][i - 1];
		}
		for (int j = 1; j < m; j++) {
			map[j][0] += map[j - 1][0];
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				map[i][j] += Math.min(map[i - 1][j], map[i][j - 1]);
			}
		}
		return map[m - 1][n - 1];
	}
}
