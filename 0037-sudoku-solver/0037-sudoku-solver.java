class Solution {
    public boolean Isempty(char[][] board , int[] empty){
        for(int i=0;i<board[0].length ; i++){
            for(int j=0;j<board[0].length ; j++){
                if(board[i][j]=='.'){
                    empty[0] =i;
                    empty[1] = j;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isValid(char[][]board , char value, int rowIndex , int colIndex){
        //for row 
         for(int i=0;i<9;i++){
            if(board[rowIndex][i]==value){
                return false;
            }

            if(board[i][colIndex]==value){
                return false;
            }
            if(board[3*(rowIndex/3)+i/3][3*(colIndex/3)+i%3]==value){
                return false;
            }
        }
        return true;
        
    }
    public boolean solveSudokuSolver(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(board,c,i,j)){
                            board[i][j]=c;
                            if(solveSudokuSolver(board)==true){
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solveSudokuSolver(board);
    }
}