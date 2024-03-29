/**
 * Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * 
 * Given matrix = [
 *   [3, 0, 1, 4, 2],
 *   [5, 6, 3, 2, 1],
 *   [1, 2, 0, 1, 5],
 *   [4, 1, 0, 1, 7],
 *   [1, 0, 3, 0, 5]
 * ]
 * sumRegion(2, 1, 4, 3) -> 8
 * sumRegion(1, 1, 2, 2) -> 11
 * sumRegion(1, 2, 2, 4) -> 12
 * 
 * @author calvinliu
 * @solution
 * 
 */
public class RangeSumQuery2DImmutable {

	public class NumMatrix {

		private int[][] sum;

		public NumMatrix(int[][] matrix) {
			if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
				return;
			}
			sum = new int[matrix.length + 1][matrix[0].length + 1];
			for (int i = 1; i <= matrix.length; i++) {
				for (int j = 1; j <= matrix[0].length; j++) {
					sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
				}
			}
		}

		public int sumRegion(int row1, int col1, int row2, int col2) {
			return sum[row2 + 1][col2 + 1] - sum[row2 + 1][col1] - sum[row1][col2 + 1] + sum[row1][col1];
		}
	}
}
