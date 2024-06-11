class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int i=0;
        int j = height.length-1;
        while(i<j){
                int distance = j-i;
                int minHeight = Math.min(height[i], height[j]);
                ans = Math.max(ans, distance * minHeight);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return ans;
    }
}