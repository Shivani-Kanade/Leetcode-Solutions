class Solution {
    public void backtrack(List<List<String>> result , char[][] board , int row){
        if(row== board.length){
            List<String> ans = new ArrayList<>();
            for(char[] r : board){
                ans.add(new String(r));
            }
            result.add(ans);
            return;
        }
        for(int col = 0 ; col<board.length; col++){
            if(isSafe(board.length, board, row, col)) {
                 board[row][col] = 'Q';
                backtrack(result, board, row + 1);
                board[row][col] = '.';
}
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board){
            Arrays.fill(row , '.');
        }
        backtrack(result,board,0);
        return result;
    }
     private boolean isSafe(int n, char[][] nQueens, int row, int col) {
        // Check if there's any queen in the same column above current position
        for (int i = 0; i < n; i++) {
            if (nQueens[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal for any queen
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal for any queen
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }

        // If no conflicts found, position is safe
        return true;
    }
}