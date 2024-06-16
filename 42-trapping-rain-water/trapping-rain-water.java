class Solution {
    public int trap(int[] height) {
        int count = 0;
        int n = height.length;
        int [] prifix = new int[n];
        int [] sufix = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
          max = Math.max(max, height[i]);
          prifix[i] = max;
        }
        
        int max2 = 0;
        for(int i=n-1; i>=0; i--){
          max2 = Math.max(max2, height[i]);
          sufix[i] = max2;
        }
        
        for(int i=0; i<n; i++){
            count += Math.min(prifix[i], sufix[i]) - height[i];
        }
        return count;
    }
}