class Solution {
    public int[] singleNumber(int[] nums) {
        //Find their XOR
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        //Finding a SetBit
        int setBit = 0;
        while((result & (1 << setBit)) == 0){
            setBit++;
        }
        int ans1 = 0;
        int ans2 = 0; 
        for(int i=0;i<nums.length;i++){
            if((nums[i] & (1 << setBit)) != 0){
                ans1 ^= nums[i];
            }
            else{
                ans2 ^= nums[i];
            }
        }
        int[] ans = new int[2];
        ans[0] = ans1;
        ans[1] = ans2;
        Arrays.sort(ans);
        return ans;
    }
}