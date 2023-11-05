class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
       int left = 0;
       int right = n-1;
       int mid = 0;

       while(mid<=right){
           if(nums[mid]==0){
             int temp = nums[mid];
             nums[mid] = nums[left];
             nums[left] = temp;
             mid++;
             left++;   
       }else if(nums[mid]==1){
           mid++;
       } else{
            int temp = nums[mid];
             nums[mid] = nums[right];
             nums[right] = temp;
             right--;   
        }
       }            
        
    }
}