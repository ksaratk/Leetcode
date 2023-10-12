class Solution {
    public int[][] generateMatrix(int n) {
        int [][] result = new int[n][n];
        int col = result[0].length;
        int row = result.length;

        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row-1;
        int count=1;
        while(left<=right && top<=bottom){

            for(int i=left; i<=right; i++){
                result[top][i] = count;
                count = count+1;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                result[i][right] = count;
                count = count+1;
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    result[bottom][i] = count;
                    count = count+1;
            }
            bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    result[i][left] = count;
                    count = count+1;
            }
            left++;
            }
        }
        return result;
    }
}