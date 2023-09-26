class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;
        for(int i=0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(max < mat[i][j]){
                    max = mat[i][j];
                      row = i;
                      col = j;
                }
            }
            
        }
        return new int[]{row, col};
    }
}