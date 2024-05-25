class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean [][] board = new boolean[n][n];
        helper(0, board, ans);
        return ans;
    }
    
    public void helper(int row, boolean [][] board, List<List<String>> ans ){
           if(row == board.length){
               display(board, ans);
               return;
           }
        
        for(int col = 0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                helper(row +1 , board, ans);
                board[row][col] = false;
            }
        }
    }
    
    
    public boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col]) return false;
        }
        
        int maxLeft= Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i]) return false;
        }
        
        int maxRight= Math.min(row, board.length-col-1);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i]) return false;
        }
        
        return true;
    }
    
    
    public void display(boolean [][] board, List<List<String>> ans){
        List<String> temp = new ArrayList<>();
        for(boolean[] row : board){
            String s = "";
            for(boolean col : row){
                if(col){
                    s += "Q";
                } else{
                    s += ".";
                }
            }
            temp.add(s);
        }
        ans.add(temp);
    }
}