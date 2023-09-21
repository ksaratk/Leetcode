class Solution {
    public int splitArray(int[] nums, int k) {
        
        int n = nums.length;
        int low = Integer.MIN_VALUE;
        int high =0;
        // if(k==1){
        //     return high;
        // }
        for(int i=0; i<n; i++){
            high = high+nums[i];
            low = Math.max(low, nums[i]);
        }
            // for(int i=low; i<=high; i++){
            //     if(subArraySum(nums, i)==k){
            //         return i;
            //     }
            // }
            // return low;

            while(low<=high){
                int mid = (low+high)/2;
                int subArray = subArraySum(nums, mid);
                if(subArray>k){
                    low = mid+1;
                } else{
                    high = mid - 1;
                }
            }
            return low;
    }

    public int subArraySum(int [] nums, int number){
        int subArray = 1;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(sum + nums[i]<=number){
            sum+= nums[i];
        } else{
            subArray++;
            sum = nums[i];
        }
    }
    return subArray;
    }
}