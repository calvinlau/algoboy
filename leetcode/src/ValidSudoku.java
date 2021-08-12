/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * 
 * The Sudoku board could be partially filled, where empty cells are filled with
 * the character '.'.
 * 
 * 
 * A partially filled sudoku which is valid.
 * 
 * Note: A valid Sudoku board (partially filled) is not necessarily solvable.
 * Only the filled cells need to be validated.
 * 
 * @author calvinliu
 * 
 */

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
    	int n = board.length;
    	boolean[] used = null;
    	for (int i = 0; i < n; i++) {
    		used = new boolean[n];
    		for (int j = 0; j < n; j++) {
    			if (!check(used, board[i][j]))
    				return false;
    		}
    		used = new boolean[n];
    		for (int j = 0; j < n; j++) {
    			if (!check(used, board[j][i]))
    				return false;
    		}
    		used = new boolean[n];
		}
    	
    	for (int r = 0; r < n / 3; r++) {
    		for (int c = 0; c < n / 3; c++) {
    			used = new boolean[n];
    	    	for (int i = r * 3; i < r * 3 + 3; i++) {
    	    		for (int j = c * 3; j < c * 3 + 3; j++) {
    	    			if (!check(used, board[i][j]))
    	    				return false;
    	    		}
    	    	}
    		}
    	}
    	return true;
    }

	private boolean check(boolean[] used, char c) {
		if (c == '.') return true;
		if (used[c - '1']) return false;
		used[c - '1'] = true;
		return true;
	}
}
