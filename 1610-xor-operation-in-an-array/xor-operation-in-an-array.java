class Solution {
    public int xorOperation(int n, int start) {
        
        int [] ar = new int [n];

        for(int i=0; i<n; i++){
            ar[i] = start + 2 * i;
        }
        int xor = 0;
        for(int i=0; i<n; i++){
            xor ^= ar[i];
        }
        return xor;
    }
}