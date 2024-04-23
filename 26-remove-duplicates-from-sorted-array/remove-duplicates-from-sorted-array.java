class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        
        for(int i=1; i<nums.length; i++){
            if(nums[pointer] != nums[i]){
                nums[++pointer] = nums[i];
            }
        }
        
       return pointer+1;
    }
}