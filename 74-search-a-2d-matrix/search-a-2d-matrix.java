class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0; i<matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[0].length-1]){
               if(doSearch(matrix[i], matrix[0].length, target) == true){
                   return true;
               }
            }
        }
        return false;
    }

    public static boolean doSearch(int [] matrix, int m, int target){
        int low = 0;
        int high = m-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(matrix[mid] == target){
                return true;
            } else if(matrix[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}