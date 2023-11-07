class Solution {
    public boolean search(int[] nums, int target) {
         boolean ans = false;
        int n = nums.length-1;
        int left = 0;
        int right = n;

        while(left<=right){
            int mid = (right+left)/2;

            if(nums[mid] == target){
                ans = true;
                break;
            }  

            if(nums[left] == nums[mid] && nums[mid] == nums[right]) {
            left = left+1;
                right = right-1;
            continue;
        }

            if(nums[left] <= nums[mid]){
                if(target>= nums[left] && target<= nums[mid]){
                right = mid-1;
            } else{
                left = mid+1;
            }
        } else{
            if(target>= nums[mid] && target<= nums[right]){
                left = mid+1;
            } else{
                right = mid-1;
            }
        } 
    }
    return ans;
    }
}