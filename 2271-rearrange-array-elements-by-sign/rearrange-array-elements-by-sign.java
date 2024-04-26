class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ar = new int[nums.length];
        int pos = 0;
        int neg = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                ar[pos*2] = nums[i];
                pos++;
            } else{
                ar[neg*2+1] = nums[i];
                neg++;
            }
        }
        return ar;
    }
}