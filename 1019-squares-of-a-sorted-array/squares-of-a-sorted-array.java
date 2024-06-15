class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0; 
        int j = nums.length-1;
        int k = nums.length-1;
        int [] ar = new int [nums.length];
        while(i<=j){
            int sqr = 0;
            int left =  Math.abs(nums[i]);
            int right =  Math.abs(nums[j]);
            if(left>right){
                sqr = left * left;
                i++;
            } else{
                sqr = right * right;
                j--;
            }
            
            ar[k--] = sqr;
        }
        return ar;
    }
}