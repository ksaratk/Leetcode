class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int marker = Integer.MIN_VALUE+9;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    for(int k = 0; k<n; k++){
                        if(matrix[k][j]!=0){
                            matrix[k][j] = marker;
                        }
                    }

                    for(int k = 0; k<m; k++){
                        if(matrix[i][k]!=0){
                            matrix[i][k] = marker;
                        }
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==marker){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}