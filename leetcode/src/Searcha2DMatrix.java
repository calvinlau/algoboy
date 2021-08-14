/**
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right. The first integer of each
 * row is greater than the last integer of the previous row. For example,
 * 
 * Consider the following matrix:
 * 
 * [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 * 
 * @author calvinliu
 * @solution binary search
 * 
 */
public class Searcha2DMatrix {


	public boolean searchMatrix(int[][] matrix, int target) {
		int width = matrix[0].length, height = matrix.length;
		int left = 0, right = width * height - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int i = mid / width, j = mid % width;
			if (matrix[i][j] < target) {
				left = mid + 1;
			} else if (matrix[i][j] > target) {
				right = mid - 1;
			} else if (matrix[i][j] == target) {
				return true;
			}
		}
		return false;
	}
}
