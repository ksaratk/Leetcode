class Solution {
    public int findDuplicate(int[] nums) {
       
           int i=1;
           Arrays.sort(nums);
           while(i<nums.length){
               if(nums[i-1]==nums[i]){
                  return nums[i];
               }
               i++;
           }
           return -1;
    }
}