class Solution {
    public int mySqrt(int x) {
        if(x==0) return x;
        long low = 1;
        long high = x;
        long ans = 0;
        while(low<=high){
            long mid = low+(high-low)/2;
            
            long square = mid*mid;
            
            if(square == x){
                return (int)mid;
            }
            
            if(square>x){
                high = mid - 1;
            } else{
                low = mid + 1;
                ans  = mid;
            }
        }
        return (int)ans;
    }
}