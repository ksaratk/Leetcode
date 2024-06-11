class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            val = Math.abs(val * val);
            nums[i] = val;
        }
        Arrays.sort(nums);
        return nums;
    }
}