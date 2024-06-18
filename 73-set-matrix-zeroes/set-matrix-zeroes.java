class Solution {
    public void setZeroes(int[][] matrix) {
        int max = Integer.MAX_VALUE+9;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               if(matrix[i][j] == 0){
                   //row
                   for(int k=0; k<matrix.length; k++){
                       if(matrix[k][j]!=0)
                         matrix[k][j] = max;                           
                   }
                   //col
                   for(int k=0; k<matrix[0].length; k++){
                       if(matrix[i][k]!=0)
                       matrix[i][k] = max;
                   }
               } 
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == max){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}