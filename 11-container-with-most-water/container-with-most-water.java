class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;

        while(left<right){
            int distance = right - left;

            int h = Math.min(height[left], height[right]);
            maxWater = Math.max(distance*h, maxWater);

            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxWater;
    }
}