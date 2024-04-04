class Solution {
    public int xorOperation(int n, int start) {
        int [] num = new int[n];
        int xor = 0;
        for(int i=0; i<num.length; i++){
            xor^= start + 2*i;
        }

        return xor;
    }
}