class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k<0) k = n-k;
        k = k%n;
        
        reverse(0, n-k-1, nums);
        reverse(n-k, n-1, nums);
        reverse(0, n-1, nums);
    }
    
    public void reverse(int start, int end, int [] nums){
       while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
     }
   } 
}