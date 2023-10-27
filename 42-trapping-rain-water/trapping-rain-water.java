class Solution {
    public int trap(int[] height) {
        int count = 0;
        for(int i=0; i<height.length; i++){
            count += Math.min(leftMax(height, i), rightMax(height, i)) - height[i];
        }
        return count;
    }

    public int leftMax(int [] height, int j){
        int max = Integer.MIN_VALUE;

        for(int i = j; i>=0; i--){
            max = Math.max(max, height[i]); 
        }    
        return max;    
    }

    public int rightMax(int [] height, int j){
        int max = Integer.MIN_VALUE;

        for(int i = j; i<height.length; i++){
            max = Math.max(max, height[i]); 
        }    
        return max;    
    }
}