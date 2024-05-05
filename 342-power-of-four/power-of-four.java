class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        else if(n==1) return true;
        else if(n%4 != 0) return false;
        
        n = n/4;
        return isPowerOfFour(n);
    }
}