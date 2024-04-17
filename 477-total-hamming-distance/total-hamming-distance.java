class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int setbit = 0;
        for(int i=0; i<32; i++){
            setbit = 0;
            int zeroCount = 0;
            int oneCount = 0;
            for(int j=0; j<nums.length; j++){
                if((nums[j]&1) == 0){
                    zeroCount += 1;  
                } else{
                    oneCount += 1;
                }
                nums[j] = nums[j]>>1;
            }
            setbit = zeroCount*oneCount;
            ans += setbit;
        }
        return ans;
    }
}