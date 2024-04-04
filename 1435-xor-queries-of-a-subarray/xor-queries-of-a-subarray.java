class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int result [] = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int [] a = queries[i];
            int xor = 0;
            for(int j = a[0]; j<=a[1]; j++){
                xor ^= arr[j];
            }
            result[i] = xor;
        }
        return result;
    }
}