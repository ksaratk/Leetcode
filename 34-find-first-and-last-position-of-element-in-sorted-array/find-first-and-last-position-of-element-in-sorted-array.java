class Solution {
    public int[] searchRange(int[] nums, int target) {
            
            int [] result = new int[2];
            int first = firstOccurance(nums, target);
            int last = lastOccurance(nums, target);
            result[0] = first;
            result[1] = last;
            return result;
    }

    public int firstOccurance(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int ans =-1;
        while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]==target){
            ans = mid;
            high = mid-1;
        } else if(nums[mid]>target){
           high = mid-1;
        }else{
           low = mid+1;
        }
        }
        return ans;
    }
    public int lastOccurance(int[] nums, int target){
         int low=0;
        int high=nums.length-1;
        int ans =-1;
        while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]==target){
            ans = mid;
            low = mid+1;
        } else if(nums[mid]>target){
           high = mid-1;
        }else{
           low = mid+1;
        }
        }
        return ans;
    }
}