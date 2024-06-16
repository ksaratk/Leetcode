class Solution {
    public int trap(int[] height) {
        int count = 0;
        for(int i=0; i<height.length; i++){
            int min = Math.min(maxLeft(height, i), maxRight(height, i));
            count += min - height[i];
        }
        return count;
    }
    public int maxLeft(int[] arr, int i){
            int max = arr[i];
            for(int k=i; k>=0; k--){
                max = Math.max(max, arr[k]);
            }
        return max;
        }
     public int maxRight(int[] arr, int i){
            int max = arr[i];
            for(int k=i; k<arr.length; k++){
                max = Math.max(max, arr[k]);
            }
         return max;
        }
    
}