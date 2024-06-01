class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minDef = -1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            } else{
                minDef = Math.max(minDef, nums[i] - min);
            }
        }
        return minDef==0 ? -1 : minDef;
    }
}