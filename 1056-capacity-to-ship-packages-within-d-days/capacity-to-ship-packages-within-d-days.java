class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<weights.length; i++){
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }
       int ans = -1;
        int low = max;
        int high= sum;
        while(low<=high){
            int mid = low + (high - low)/2;
            int count = countDays(weights, mid);
            if(count <= days){
                ans = mid;
                high = mid - 1; 
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public int countDays(int [] weight, int capacity){
        int day = 1;
        int totalWeight = 0;
        for(int i=0; i<weight.length; i++){
            if(totalWeight + weight[i]<=capacity){
                totalWeight = totalWeight + weight[i];    
            } else{
                day++;
                totalWeight = 0;
                totalWeight = totalWeight + weight[i];  
            }
        }
        return day;
    }
}