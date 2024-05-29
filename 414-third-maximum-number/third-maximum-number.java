class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int count = 1;
        for(int i = nums.length-2; i>=0; i--){
            if(count == 3) break;
            if(nums[i] != nums[i+1]){
                ans = nums[i];
                count++;
            }
        }
        if(count == 3){return ans;}
        return nums[nums.length-1];
    }
}