class Solution {
     public int longestConsecutive(int[] nums) {
         Arrays.sort(nums);
         int min = Integer.MIN_VALUE;
        int count = 1;
        int maxCons = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]-1==min){
                count++;
                min = nums[i];
            } else if(nums[i]!=min){
                count = 1;
                min = nums[i];
            }
        maxCons = Math.max(maxCons, count);
         }
         return maxCons;
    }
}