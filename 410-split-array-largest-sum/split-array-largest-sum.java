class Solution {
    public int splitArray(int[] nums, int k) {
        
        int min = Integer.MIN_VALUE;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            max += nums[i];
            min = Math.max(min, nums[i]); 
        }
        int low = min;
        int high = max;
        while(low<=high){
            int mid = (low+high)/2;
            int result = isPossible(nums, mid);
            // if(result==k){
            //     return mid;
            // } 
            if(result<=k){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
        }

    public int isPossible(int [] nums, int sum){
        int totalSum = 0;
        int subArray = 1;

        for(int i=0; i<nums.length; i++){
            if(totalSum+nums[i]<=sum){
                totalSum += nums[i];
            } else{
                subArray++;
                totalSum = nums[i];
            }
        }
        return subArray;
    }
}