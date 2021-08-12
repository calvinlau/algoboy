import java.util.ArrayList;
import java.util.List;

/**
 * Follow up for N-Queens problem.
 * 
 * Now, instead outputting board configurations, return the total number of
 * distinct solutions.
 * 
 * @author calvinliu
 * 
 */
public class NQueensII {

    public int totalNQueens(int n) {
       	List<String[]> ret = new ArrayList<String[]>();
    	int[] path = new int[n];
    	solveNQueensRe(ret, path, 0);
    	return ret.size();
    }

	private void solveNQueensRe(List<String[]> ret, int[] path, int row) {
		if (row == path.length) {
			print(ret, path);
		} else {
			for (int i = 0; i < path.length; i++) {
				path[row] = i;
				if (isValid(path, row)) {
					solveNQueensRe(ret, path, row + 1);
				}
			}
		}
	}

	private void print(List<String[]> ret, int[] path) {
		String[] tmp = new String[path.length];
		for (int i = 0; i < path.length; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < path.length; j++) {
				if (j == path[i]) {
					sb.append('Q');
				} else {
					sb.append('.');
				}
			}
			tmp[i] = sb.toString();
		}
		ret.add(tmp);
	}

	private boolean isValid(int[] path, int row) {
		for (int i = 0; i < row; i++) {
			if (path[row] == path[i] || Math.abs(path[i] - path[row]) == row - i) {
				return false;
			}
		}
		return true;
	}
}
