class Solution {
    public int countPrimes(int n) {
        boolean [] prime = new boolean [n];
        
        Arrays.fill(prime, true);
        for(int i = 2; i*i<=n; i++){
            if(prime[i]){
                for(int j = i*i; j<n; j = j+i){
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2; i<prime.length; i++){
            if(prime[i] == true) count++;
        }
        return count;
     }
}