class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int ans = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<bloomDay.length; i++){
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
       int low  = min;
       int high = max;

       while(low<=high){
           int mid = (low+high)/2;

           if(ifBouquetForm(mid, k, m, bloomDay)==true){
               ans = mid;
               high = mid-1;
           } else{
               low = mid+1;
           }
       }
        return ans;
    }

    public boolean ifBouquetForm(int day, int k, int m, int[] bloomDay){
        int bouquetForm = 0;
        int bloomed = 0;
        for(int i=0; i<bloomDay.length; i++){
            if(day>=bloomDay[i]){
                bloomed++;
            }else{
                bouquetForm += bloomed/k;
                bloomed = 0;
            }
        }
        bouquetForm += bloomed/k;
        System.out.println(bouquetForm);
        if(bouquetForm>=m) return true;
        return false;
    }   
}