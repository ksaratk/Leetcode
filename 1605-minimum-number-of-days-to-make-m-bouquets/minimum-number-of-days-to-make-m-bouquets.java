class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((m*k)>n) return -1;

        int min  = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for( int i = 0; i<n; i++){
            min = Math.min(min, bloomDay[i]);
            maxi= Math.max(maxi, bloomDay[i]);
        }
        // for(int i = min; i<=maxi; i++){
        //     if(possible(bloomDay, i, m, k)){
        //         return i;
        //     }
        // }
        int ans = -1;
        while(min<=maxi){
            int mid = (min+maxi)/2;

            if(possible(bloomDay, mid, m, k)){
                ans = mid;
                maxi = mid - 1;
            } else{
                min = mid + 1;
            }
        }
        return ans;
    }

    public boolean possible(int [] bloomDay, int day, int m, int k){
        int bouquetsForm = 0;
        int count = 0;

        for(int i = 0; i<bloomDay.length; i++){
            if(bloomDay[i] <= day){
                count++;
            } else{
                bouquetsForm += (count/k); 
                count = 0;
            }
        }
        bouquetsForm += count/k;
        if(bouquetsForm >= m)return true;
        return false;
    }
}