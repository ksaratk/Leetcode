class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1]){
                    return binarySearch(matrix[i], target);             
            }
        }
        return false;
    }

    public boolean binarySearch(int [] matrix, int target){
        int low = 0;
        int high = matrix.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(matrix[mid]==target){
                return true;
            }

            if(matrix[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}