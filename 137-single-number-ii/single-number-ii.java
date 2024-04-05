class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[0];
        int count = 1;
       for(int i=1; i<nums.length; i++){
            if(ans == nums[i]){
                count++;
            } else if(ans != nums[i] && count == 1) {
                return ans;
            } else{
                ans = nums[i];
                count = 1;
            }
       }     
       return ans;
    }
}