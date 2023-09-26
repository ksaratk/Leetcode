class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat[0].length;
        int low = 0;
        int high = m-1;

        while(low<=high){
            int col = (low + high)/2;
            int row = maxElementRow(mat, m, col);
            int left = col - 1 >= 0  ? mat[row][col-1] : -1;
            int right =col + 1 < m  ? mat[row][col+1] : -1;
            if(left < mat[row][col] && right < mat[row][col]){
                return new int[]{row, col};
            } else if(left < mat[row][col]){
                low = col + 1;
            } else{
                high = col - 1;
            }
        }
        return new int[]{-1,-1};
    }

    public int maxElementRow(int [][]mat, int m, int col){
        int maxValue = -1;
        int rowIndex = -1;

        for(int i=0; i<mat.length; i++){
            if(mat[i][col]>maxValue){
                maxValue = mat[i][col];
                rowIndex = i;
            }
        }
        return rowIndex;
    }
}