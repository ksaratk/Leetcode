class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] pos = new int[n/2];
        int [] neg = new int[n/2];

        int negIndex = 0;
        int posIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                neg[negIndex++] = nums[i];
            } else{
                pos[posIndex++] = nums[i];
            }
        }

        for(int i=0; i<pos.length; i++){
            nums[i*2] = pos[i];
            nums[i*2+1] = neg[i];
        }

        return nums;
    }
}