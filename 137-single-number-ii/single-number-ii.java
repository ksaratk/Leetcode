class Solution {
    public int singleNumber(int[] nums) {
        long ans = 0;
        int setbit = 0;
        int p = 0;
        for(int i=0; i<32; i++){
            setbit = 0;
            for(int j=0; j<nums.length; j++){
                setbit += nums[j]&1;
                nums[j] = nums[j]>>1;
            }
            setbit = setbit%3; 
            ans +=  setbit * (long)Math.pow(2, p++); 
        }       
        return (int)ans;
    }
}