class Solution {
    public int subsetXORSum(int[] nums) {
       return helper(nums, 0, 0);
    }
    
    public int helper(int [] nums, int i, int ans){
        if(i == nums.length) return ans;
        
        int left  = helper(nums, i+1, ans^nums[i]);
        int right  = helper(nums, i+1, ans);
        
        return left+right;
    }
}