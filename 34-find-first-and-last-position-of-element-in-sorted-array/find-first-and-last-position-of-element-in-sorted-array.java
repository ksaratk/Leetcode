class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int second = -1;

     int left = 0;
     int right = nums.length-1;

     while(left<=right){
         int mid = (left+right)/2;

         if(nums[mid]==target){
             first = mid;
             right = mid-1;
         } else if(nums[mid] > target){
             right = mid-1;
         } else{
             left = mid+1;
         }
     }

        left = 0;
        right = nums.length-1;

     while(left<=right){
         int mid = (left+right)/2;

         if(nums[mid]==target){
             second = mid;
             left = mid+1;
         } else if(nums[mid] > target){
             right = mid-1;
         } else{
             left = mid+1;
         }
     }


        return new int[]{first, second};
    }
}