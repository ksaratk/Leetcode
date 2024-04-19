class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
                count += grid[i].length-binarySearch(grid[i]);
        }
        return count;
    }
    
    
    public int binarySearch(int [] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid] <0){
                ans = mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return ans;
    }
}