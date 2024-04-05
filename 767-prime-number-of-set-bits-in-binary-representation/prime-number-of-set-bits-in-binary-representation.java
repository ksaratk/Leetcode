class Solution {
    boolean primes [] = new boolean[33];
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        int ans = 0;
        Arrays.fill(primes, true);
        for(int i = 2; i*i<=primes.length; i++){
            if(primes[i]){
                for(int j= i*i; j<primes.length; j=i+j){
                    primes[j] = false;
                }
            }
        }
        for(int i = left ; i<= right; i++){
            count  = isSetBit(i);
            if(isPrime(count)){
                ans++;
            }
        }
        return ans;
    }

    public boolean isPrime(int num){
        if(num<=1) return false;
        return primes[num];
    }

    public int isSetBit(int num){
        
        int count = 0;
        while(num>0){
            int bit = num%2;
            if(bit==1){
                count++;
            }
            num /= 2;
        }
        return count;
    }
}