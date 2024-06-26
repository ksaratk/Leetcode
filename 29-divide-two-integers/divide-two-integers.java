class Solution {
    public int divide(int dividend, int divisor) {
       int result;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            result = Integer.MAX_VALUE; // Special case to avoid overflow
        } else {
            result = dividend / divisor;
        }
        return result;
    }
}