class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int [] ar = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                ar[pos] = nums[i];
                pos = pos+2;
            } else {
                ar[neg] = nums[i];
                neg = neg+2;
            }
        }
        return ar;
    }
}