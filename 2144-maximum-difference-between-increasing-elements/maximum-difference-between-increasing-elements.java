class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int maxDif = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            } else {
                maxDif = Math.max(maxDif, nums[i] - min);
            }
        }
        return maxDif==0 ? -1 : maxDif;
    }
}