class Solution {
    public int[] singleNumber(int[] nums) {
        int [] result = new int[2];
         Arrays.sort(nums);
        int ans = nums[0];
        int count = 1;
        int k = 0;
       for(int i=1; i<nums.length; i++){
            if(ans == nums[i]){
                count++;
            } else if(ans != nums[i] && count == 1) {
                 result[k++] = ans;
                 ans = nums[i];
                count = 1;
            } else{
                ans = nums[i];
                count = 1;
            }
       }     
       if(count==1){result[k] = ans;}
       return result;
    }
}