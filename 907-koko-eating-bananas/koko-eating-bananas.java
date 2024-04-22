class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        int high = max;
        int low = 1;
        int ans = 0;
       while(low<=high){
         int mid = (low+high)/2;   
         int count = countTotalHour(piles, mid);            
           
         if(count <= h){
             ans = mid;
             high = mid -1;
         }else{
            low = mid + 1;
         }
        }
        return ans;
    }
    
    public int countTotalHour(int [] piles, int hour){
        int countHour = 0;
        for(int i=0; i<piles.length; i++){
            countHour += Math.ceil((double)piles[i]/(double)hour);
        }
        return countHour;
    }
}