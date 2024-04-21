class Solution {
    public void rotate(int[][] matrix) {
        int [][] copy = new int[matrix.length][matrix[0].length];
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                copy[j][matrix[0].length-i- 1] = matrix[i][j];
            }
        }
        
        for(int i = 0; i<copy.length; i++){
            for(int j = 0; j<copy[0].length; j++){
                 matrix[i][j] = copy[i][j];
            }
        }
    }
}