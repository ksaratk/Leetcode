class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int [] prifixXor = new int [arr.length];
        int [] ans = new int [queries.length];
         prifixXor[0] = arr[0];
        for(int i=1; i<prifixXor.length; i++){ 
            prifixXor [i] = prifixXor[i-1]^arr[i];
        }
            
            for(int i = 0; i<queries.length; i++){
                int left = queries[i][0];
                int right = queries[i][1];

                if(left == 0){
                    ans[i] = prifixXor[right];
                } else{
                    ans[i] =  prifixXor[right] ^ prifixXor[left-1];
                }
            }
        return ans;
    }
}