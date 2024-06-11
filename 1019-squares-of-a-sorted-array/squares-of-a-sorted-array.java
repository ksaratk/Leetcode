class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int ind  = nums.length-1;
        int [] newArray = new int[nums.length];
        while(i<=j){
            int val1 = Math.abs(nums[i]);
            int val2 = Math.abs(nums[j]);
            
            if(val1 > val2){
                newArray[ind--] = val1 * val1;
                i++;
            } else{
                newArray[ind--] = val2 * val2;
                j--;
            }
        }
        return newArray;
    }
}