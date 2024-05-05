class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean [][] board = new boolean[n][n];
        List<List<String>> list = new ArrayList<List<String>>();
        helper(board, list, 0);
        return list;
    }
    
    public void helper(boolean[][] board, List list, int r){
        if(r==board.length){
            display(board, list);
            return;
        }
        
        for(int c=0; c<board.length; c++){
            if(isSafe(board, r, c)){
                board[r][c] = true;
                helper(board, list, r+1);
                board[r][c] = false;
            }
        }
    }
    
    public boolean isSafe(boolean [][] board, int r, int c){
        for(int i=0; i<r; i++){
            if(board[i][c]){
                return false;
            }
        }
        
        int maxLeft = Math.min(r,c);
        for(int i=1; i<=maxLeft; i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        
        int maxRight = Math.min(r, board.length-1-c);
        for(int i=1; i<=maxRight; i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
    
    public void display(boolean[][]board, List list){
         int n = board.length;
        List<String> newList = new ArrayList<String>();
         for(int i=0; i<board.length; i++){
             String s = "";
            for(int j=0; j<board.length; j++){
               if(board[i][j]){
                   s = s+"Q";
               }else{
                   s = s+".";
               } 
            }
             newList.add(s);   
        }
        list.add(newList);
    }
}