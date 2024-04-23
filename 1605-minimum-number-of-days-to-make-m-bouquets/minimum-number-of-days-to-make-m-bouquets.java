class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((m*k)>bloomDay.length) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<bloomDay.length; i++){
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        int ans = -1;
        int low = min;
        int high = max;
      while(low<=high){
          int mid = (low+high)/2;
          int count = bouquetCount(bloomDay, mid, k);
          
          if(count >= m){
              ans = mid;
              high = mid - 1;
          } else{
              low =  mid + 1;
          }
      }
        
        return ans;
    }
    
    public int bouquetCount(int [] bloomDay, int day, int k){
        int count = 0; int bouquete = 0;
        
        for(int i=0; i<bloomDay.length; i++){
            if(day>=bloomDay[i]){
                count++;
            }else if(count!=0){
                bouquete += count/k;
                count = 0;
            }
        }
        bouquete += count/k;
        return bouquete;
    }
}