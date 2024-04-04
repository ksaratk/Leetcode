class Solution {
    public int xorOperation(int n, int start) {
        int [] num = new int[n];
        for(int i=0; i<num.length; i++){
            num[i] = start + 2*i;
        }
        int xor = 0;
        for(int i=0; i<num.length; i++){
            xor = xor^num[i];
        }
        return xor;
    }
}