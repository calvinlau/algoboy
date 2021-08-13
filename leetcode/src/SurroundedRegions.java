import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * For example,
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * After running your function, the board should be:
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * @author calvinliu
 *
 */
public class SurroundedRegions {
    public void solve(char[][] board) {
		if (board == null || board.length <= 1 || board[0].length <= 1)
			return;
    	int n = board.length, m = board[0].length;
    	for (int i = 0; i < m; i++) {
    		bfs(board, 0, i);
    		bfs(board, n - 1, i);
		}
    	for (int i = 0; i < n; i++) {
    		bfs(board, i, 0);
    		bfs(board, i, m - 1);
		}
    	for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (board[i][j] == 'O') {
					board[i][j] = 'X';
				}
				if (board[i][j] == 'Z') {
					board[i][j] = 'O';
				}
			}
		}
    }

	private void bfs(char[][] board, int i, int j) {
		int n = board.length, m = board[0].length;
		if (board[i][j] != 'O') {
			return;
		}
		board[i][j] = 'Z';
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(i * m + j);
    	while (!queue.isEmpty()) {
    		int index = queue.poll();
    		int row = index / m, col = index % m;
    		if(row > 0 && board[row - 1][col] == 'O') {
    			board[row - 1][col] = 'Z';
    			queue.add((row - 1) * m + col);
    		}
    		if(row < n - 1 && board[row + 1][col] == 'O') {
    			board[row + 1][col] = 'Z';
    			queue.add((row + 1) * m + col);
    		}
    		if(col > 0 && board[row][col - 1] == 'O') {
    			board[row][col - 1] = 'Z';
    			queue.add(row * m + col - 1);
    		}
    		if(col < m - 1 && board[row][col + 1] == 'O') {
    			board[row][col + 1] = 'Z';
    			queue.add(row * m + col + 1);
    		}
    	}
	}
}
