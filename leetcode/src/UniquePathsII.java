/**
 * Follow up for "Unique Paths":
 * 
 * Now consider if some obstacles are added to the grids. How many unique paths
 * would there be?
 * 
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * 
 * For example, There is one obstacle in the middle of a 3x3 grid as illustrated
 * below.
 * 
 * @author calvinliu
 * @Solution DP Function: f[i][j] = (f[i][j] == 1) ? 0 : f[i][j - 1] + f[i - 1][j];
 * 
 */
public class UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid == null || obstacleGrid.length == 0) {
			return 0;
		}
		int m = obstacleGrid.length, n = obstacleGrid[0].length;
		int[][] map = new int[m][n];
		map[0][0] = (obstacleGrid[0][0] == 1) ? 0 : 1;
		for (int i = 1; i < m; i++) {
			map[i][0] = (obstacleGrid[i][0] == 1) ? 0 : map[i - 1][0];
		}
		for (int j = 1; j < n; j++) {
			map[0][j] = (obstacleGrid[0][j] == 1) ? 0 : map[0][j - 1];
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				map[i][j] = (obstacleGrid[i][j] == 1) ? 0 : map[i][j - 1] + map[i - 1][j];
			}
		}
		return map[m - 1][n - 1];
    }
}
