import java.util.Arrays;

/**
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * 
 * Empty cells are indicated by the character '.'.
 * 
 * You may assume that there will be only one unique solution.
 * 
 * @author calvinliu
 * 
 */
public class SudokuSolver {

	public static void main(String[] args) {
		char[][] board = new char[9][9];
		Arrays.fill(board, '.');
		new SudokuSolver().solveSudoku(board);
	}

    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) return;
        solveSudokuRe(board);
    }

	private boolean solveSudokuRe(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '.') {
					for (int k = 1; k <= board.length; k++) {
						if (isValid(board, i, j, k)) {
							board[i][j] = (char) ('0' + k);
							if (solveSudokuRe(board)) {
								return true;
							} else {
								board[i][j] = '.';
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	private boolean isValid(char[][] board, int i, int j, int k) {
		for (int n = 0; n < board.length; n++) {
			if (('0' + k) == board[i][n]) {
				return false;
			}
		}
		for (int n = 0; n < board.length; n++) {
			if (('0' + k) == board[n][j]) {
				return false;
			}
		}
		for (int n = i / 3 * 3; n < i / 3 * 3 + 3; n++) {
			for (int m = j / 3 * 3; m < j / 3 * 3 + 3; m++) {
				if (('0' + k) == board[n][m]) {
					return false;
				}
			}
		}
		return true;
	}
}
