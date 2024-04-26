class Solution {
    
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int sum = 0;
        int start = -1;
        int end = -1;
        int maxSum = Integer.MIN_VALUE;   
        
      for(int i=0; i<nums.length; i++){
            sum += nums[i];
            
            if(sum>maxSum){
                maxSum = sum;
                end = i;
            }
            
            if(sum<0){
                sum = 0;
                start = i;
            }
        }
        System.out.print(end-start);
        return maxSum;
    }
}