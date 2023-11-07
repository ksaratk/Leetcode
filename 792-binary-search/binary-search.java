class Solution {
    public int search(int[] nums, int target) {
        
        int i =0;
        int  j = nums.length-1;

        while(i<=j){
            int m = (i+j)/2;
            System.out.print(m);
            if(nums[m]==target){
                return  m;
            } else if(nums[m]<target){
                i = m+1;
            }else{
                j = m-1;
            }
        }
        return -1;
    }
}