class Solution {
     boolean [] prime = new boolean[33];
    public int countPrimeSetBits(int left, int right) {
        Arrays.fill(prime, true);
        int count = 0;
        for(int i = 2; i*i<=prime.length-1; i++){
            if(prime[i]){
                for(int j = i*i; j<=prime.length-1; j = j+i){
                    prime[j] = false;
                }
            }
        }
        for(int i=left; i<=right; i++){
            int setBit = isSetBit(i);
            if(isPrime(setBit)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int i) {
        if (i < 2) return false;
        return prime[i];
    }

    public int isSetBit(int i) {
        int count = 0;

        while (i > 0) {
            if (i % 2 == 1) {
                count++;
            }
            i = i / 2;
        }
        return count;
    }
}