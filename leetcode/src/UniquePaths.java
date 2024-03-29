/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * @author calvinliu
 * @Solution DP Function: f[i][j] = f[i - 1][j] + f[i][j - 1];
 * 
 */
public class UniquePaths {
	
    public int uniquePaths_1(int m, int n) {
    	if(m == 1 || n == 1) return 1;
    	return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }

    public int uniquePaths(int m, int n) {
    	int[][] map = new int[m][n];
    	for (int i = 0; i < m; i++) {
			map[i][0] = 1;
		}
    	for (int j = 0; j < n; j++) {
			map[0][j] = 1;
		}
    	for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				map[i][j] = map[i - 1][j] + map[i][j - 1];
			}
		}
    	return map[m - 1][n - 1];
    }
}
