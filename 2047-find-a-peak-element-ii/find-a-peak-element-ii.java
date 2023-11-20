class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int []result = null;
        for(int i=0; i<mat.length; i++){
             for(int j=0; j<mat[0].length; j++){
                 if(mat[i][j]>=max){
                     max = mat[i][j];
                     result = new int[]{i,j};
                 }
             }
        }
        return result;
    }
}