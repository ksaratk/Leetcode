class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length == 0) return 0;
        Arrays.sort(nums);
    //0  1  1  2
        int max = 1;
        int count = 1; int prev = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]-1 == prev){
                count++;
                prev = nums[i];
            } else if(nums[i] != prev){
                prev = nums[i];
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}