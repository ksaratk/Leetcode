class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          for(int i=0; i<matrix.length; i++){
              boolean result =  doSearch(matrix[i], matrix[0].length, target);
               if(result == true){
                   return true;
               }
            }
            return false;
        }
       public boolean doSearch(int[] matrix , int m, int target){
           int low = 0;
           int high = m-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(matrix[mid] == target){
                return true;
            } else if(matrix[mid] > target){
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return false;
    }
}