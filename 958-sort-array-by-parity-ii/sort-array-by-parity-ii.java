class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int e = 0;
        int o = 1;
        while(o<nums.length && e<nums.length){
            if(nums[e]%2==0) e = e+=2;
            else if(nums[o]%2==1) o = o+=2;
            else{
                int temp = nums[o];
                nums[o] = nums[e];
                nums[e] = temp;
            }
        }
        return nums;
    }
}