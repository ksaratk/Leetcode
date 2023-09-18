class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int n = piles.length;
        int maxElement = findMax(piles, n);
        // for(int i = 1; i<maxElement; i++){
        //     int requiredTime = calculateHour(piles, i, n);
        //     if (requiredTime <= h){
        //       return i;
        //     }
        //   }
        int low = 1;
        int high = maxElement;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            int requiredTime = calculateHour(piles, mid, n);
            if (requiredTime <= h){
                high = mid-1;
            } else{
                low  = mid+1;
            }
        }
          return low;
        }

        public int findMax(int [] pile, int n){
        int max = Integer.MIN_VALUE;
        
            for(int i=0; i<n; i++){
                max = Math.max(max, pile[i]);
            }
            return max;
        }

        public int calculateHour(int [] pile, int hour, int n){
        int requiredTime = 0;

            for(int i=0; i<n; i++){
                requiredTime += Math.ceil((double)pile[i]/(double)hour);
            }
            return requiredTime;
        }
}