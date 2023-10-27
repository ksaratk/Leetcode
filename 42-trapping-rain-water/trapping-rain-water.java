class Solution {
    public int trap(int[] height) {
        int count = 0;
        int n = height.length;
        int [] leftMax = new int[n];
        int [] rightMax = new int[n];
        for(int a:leftMax){
            System.out.print(a+" ");
        }
        for(int a:rightMax){
            System.out.print(a+" ");
        }
        leftMaxInsert(leftMax, height, n);
        rightMaxInsert(rightMax, height, n);
        for(int i=0; i<n; i++){
            count += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return count;
    }

    public void leftMaxInsert(int [] leftMax, int [] height, int n){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(height[i]>max){
                max = height[i];
                leftMax[i] = max;
            }  else{
                leftMax[i] = max;
            }     
        }        
    }

    public void rightMaxInsert(int [] rightMax, int [] height, int n){
         int max = Integer.MIN_VALUE;

        for(int i = n-1; i>=0; i--){
            if(height[i]>max){
                max = height[i];
                rightMax[i] = max;
            } else{
                rightMax[i] = max;
            }       
        }        
    }
}