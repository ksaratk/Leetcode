class Solution {
   public boolean exist(char[][] board, String word) {
		return search(board, word);
	}

	public boolean search(char[][] board, String word) {
		boolean result = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					String p = "";
					result = doSearch(i, j, word, board, p + word.charAt(0), 1);
					if(result)return result;
				}
			}
		}
		return result;
	}

	public boolean doSearch(int row, int col, String word, char[][] board, String p, int i) {
	if (word.equals(p)) {
			return true;
		}
//
//		if (row == board.length && col == board[0].length) {
//			return false;
//		}
        char character = board[row][col];
		board[row][col] = '0';
		char ch = word.charAt(i);

		if (col < board[0].length - 1) {
			if (board[row][col + 1] == ch) {
				boolean found = doSearch(row, col + 1, word, board, p + ch, i + 1);
				if (found) {
	                return true;
	            }
			}
		}

		if (row < board.length - 1) {
			if (board[row + 1][col] == ch) {
				boolean found = doSearch(row + 1, col, word, board, p + ch, i + 1);
				if (found) {
	                return true;
	            }
			}
		}
		if (row > 0) {
			if (board[row - 1][col] == ch) {
				boolean found = doSearch(row - 1, col, word, board, p + ch, i + 1);
				if (found) {
	                return true;
	            }
			}
		}

		if (col > 0) {
			if (board[row][col - 1] == ch) {
				boolean found = doSearch(row, col - 1, word, board, p + ch, i + 1);
				if (found) {
	                return true;
	            }

			}
		}
		board[row][col] = character;
		 return false;
	}
}