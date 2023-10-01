class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low  = 1;
        int high = Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            high = Math.max(high, piles[i]);
        }
        // for(int i=low; low<=high; i++){
        //     if(possible(piles,i)<=h){
        //         return i;
        //     }
        // }

        while(low<=high){
            int mid = (low+high)/2;
            int value = possible(piles,mid);
            if(value<=h){
                high = mid-1;
            } else{
                low = mid +1;
            }
        }
        return low;
    }

    public int possible(int [] piles, int time){
         int totalTime = 0;
        for(int i=0; i<piles.length; i++){
            totalTime += Math.ceil((double)piles[i]/(double)time);
        }
        return totalTime;
    }
}