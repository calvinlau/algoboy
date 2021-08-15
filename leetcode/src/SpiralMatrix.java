import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * 
 * For example,
 * Given the following matrix:
 * 
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 * @author calvinliu
 *
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> ret = new ArrayList<>();
    	int n = matrix.length, m = matrix[0].length, row = 0, col = -1;
    	while (true) {
    		for (int i = 0; i < m; i++) ret.add(matrix[row][++col]);
    		if (--n == 0) break;
    		for (int i = 0; i < n; i++) ret.add(matrix[++row][col]);
    		if (--m == 0) break;
    		for (int i = 0; i < m; i++) ret.add(matrix[row][--col]);
    		if (--n == 0) break;
    		for (int i = 0; i < n; i++) ret.add(matrix[--row][col]);
    		if (--m == 0) break;
    	}
    	return ret;
    }
}
