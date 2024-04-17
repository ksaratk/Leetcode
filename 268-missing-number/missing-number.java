class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        
        int n =nums.length+1;
        n = n*(n-1)/2;
        return Math.abs(sum-n);
    }
}