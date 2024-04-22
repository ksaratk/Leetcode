class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         for(int i = 0; i<matrix.length; i++){
             if(search(matrix[i], target) == true) return true;
         }
        return false;
    }
    
    public boolean search(int [] arr, int target){
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = (low + high)/2;
            
            if(arr[mid] == target){
                return true;
            }
            
            if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;                
            }
        }
        return false;
    }
}