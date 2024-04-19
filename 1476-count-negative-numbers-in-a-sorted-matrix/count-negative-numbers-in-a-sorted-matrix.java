class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int i=0; i<grid.length; i++){
            int index = binarySearch(grid[i]);
            if(index!=-1){
                ans += grid[i].length-index;
            }
        }
        return ans;
    }
    
    
    public int binarySearch(int [] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
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