class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int negIndex = 1;
        int posIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                result[negIndex] = nums[i];
                negIndex = negIndex+2;
            } else{
                result[posIndex] = nums[i];
                posIndex = posIndex+2;
            }
        }
        return result;
    }
}