class Solution {
    public int maximumCount(int[] nums) {
       int max = 0;
      int posCount = 0;
      int negCount = 0;
       for(int i=0; i<nums.length; i++){
           if(nums[i]<0){
               negCount++;
           }else if(nums[i]>0){
               posCount++;
           }
       } 
       return negCount>posCount ? negCount : posCount;  
    }
}