class Solution {

    public int trailingZeroes(int n) {

        int count = 0;
        int k = 5;
        while(k<=n) {
            count += (int)(n/k);
            k *= 5;
        }
        return count;

    }
}