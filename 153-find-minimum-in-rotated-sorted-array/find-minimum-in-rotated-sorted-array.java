class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length-1;

         while(left<=right){
            int mid = (right+left)/2;

            if(nums[left]<=nums[mid]){
              min = Math.min(min, nums[left]);
              left = mid+1;
            } else{
                min = Math.min(min, nums[mid]);
                right = mid-1;
            }
     }
     return min;
    }
}