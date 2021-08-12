/**
 * Given a 2D board and a word, find if the word exists in the grid.

 * The word can be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once.

 * For example, Given board =
 * [
 *   ["ABCE"],
 *   ["SFCS"],
 *   ["ADEE"]
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 * @author calvinliu
 * @solution recursively
 * 
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
    	int n = board.length;
    	if (n == 0) return false;
    	int m = board[0].length;
    	if (m == 0) return false;
    	boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            	if(word.charAt(0) == board[i][j] && existRe(board, i, j, word, 0, visited)) {
            		return true;
            	}
    		}
		}
    	return false;
    }

	private boolean existRe(char[][] board, int i, int j, String word, int k, boolean[][] visited) {
		if (k == word.length()) {
			return true;
		}
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
			return false;
		}
		if(visited[i][j] == true || word.charAt(k) != board[i][j]) {
			return false;
		}
		visited[i][j] = true;
		if (existRe(board, i + 1, j, word, k + 1, visited)) return true;
		if (existRe(board, i - 1, j, word, k + 1, visited)) return true;
		if (existRe(board, i, j + 1, word, k + 1, visited)) return true;
		if (existRe(board, i, j - 1, word, k + 1, visited)) return true;
		visited[i][j] = false;
		return false;
	}
}
