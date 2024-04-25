class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zeroCount++;
            }  else if(nums[i]==1){
                oneCount++;                
            } else{
                twoCount++;
            } 
        }
        
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(zeroCount!=0){
                 nums[index++] = 0;
                 zeroCount--;
            }  else if(oneCount!=0){
                nums[index++] = 1;
                oneCount--;               
            } else{
                nums[index++] = 2;
                twoCount--;
            } 
        }
    }
}