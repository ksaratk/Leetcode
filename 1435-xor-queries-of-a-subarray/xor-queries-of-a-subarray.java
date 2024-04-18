class Solution {
        public int[] xorQueries(int[] arr, int[][] queries) {
        int [] prifix = new int[arr.length];
        int [] ans = new int [queries.length];
        // prifix[0] = arr[0];
        // for(int i = 1; i<prifix.length; i++){
        //     prifix[i] = prifix[i-1]^arr[i];
        // }
            int xor = 0;
        for(int i = 0; i<prifix.length; i++){
            xor = xor^arr[i];
            prifix[i] = xor;
            System.out.println( prifix[i]);
        }
        for(int i=0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];

            if(a == 0){
                ans[i] = prifix[b];
            } else{
                ans[i] = prifix[b]^prifix[a-1]; 
            }
        }
        return ans;
    }
}