class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int i=0; i<nums.length; i++){
            high += nums[i];
            low = Math.max(low, nums[i]);
        }

        // for(int i = max; i<=sum; i++){
        //     int count = countSubArray(nums, i);
        //     if(count == k){
        //         return i;
        //     }
        // }
        // return max;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int count = countSubArray(nums, mid);
            if(count>k){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    public int countSubArray(int [] nums, int sum){
        int subArrayCount = 1;
        int value = 0;

        for(int i=0; i<nums.length; i++){
            if(value+nums[i]<=sum){
                value+=nums[i];
            }else{
               subArrayCount++;
               value = nums[i]; 
            }
        }
        return subArrayCount;
    }
}