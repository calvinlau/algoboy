import java.util.ArrayList;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard
 * such that no two queens attack each other.
 * 
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * 
 * Each solution contains a distinct board configuration of the n-queens'
 * placement, where 'Q' and '.' both indicate a queen and an empty space
 * respectively.
 * 
 * For example, There exist two distinct solutions to the 4-queens puzzle:
 * 
 * [ [".Q..", // Solution 1
 *    "...Q", 
 *    "Q...", 
 *    "..Q."],
 * 
 *   ["..Q.", // Solution 2 
 *    "Q...", 
 *    "...Q", 
 *    ".Q.."] 
 * ]
 * 
 * @author calvinliu
 * @solution http://www.cnblogs.com/TenosDoIt/p/3801621.html
 * 
 */
public class NQueens {

    public List<String[]> solveNQueens(int n) {
    	List<String[]> ret = new ArrayList<String[]>();
    	int[] path = new int[n];
    	dfs(ret, path, 0);
    	return ret;
    }

	private void dfs(List<String[]> ret, int[] path, int row) {
		if (row == path.length) {
			print(ret, path);
		}
		for (int i = 0; i < path.length; i++) {
			path[row] = i;
			if (isValid(path, row)) {
				dfs(ret, path, row + 1);
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
