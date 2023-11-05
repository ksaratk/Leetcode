class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int onesCount = 0;
        int twosCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zeroCount++;
            } else if(nums[i]==1){
                onesCount++;
            } else{
                twosCount++;
            }
        }

        for(int i=0; i<zeroCount; i++){
            nums[i] = 0;
        } 
        for(int i = zeroCount; i<zeroCount+onesCount; i++){
            nums[i] = 1;
        }
        for(int i = zeroCount+onesCount; i<nums.length; i++){
            nums[i] = 2;
        }
    }
}