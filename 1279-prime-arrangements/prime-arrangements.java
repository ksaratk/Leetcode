class Solution {
    public static final int mod = 1000000007;
    public int numPrimeArrangements(int n) {
        int primeNumber = getPrime(n);
        int nonPrime = n - primeNumber;
        long primeNumberFact = fact(primeNumber);
        long nonPrimeNumberFact = fact(nonPrime);
        long result = (primeNumberFact * nonPrimeNumberFact)%mod;
        return (int)result;
    }

    public int getPrime(int n){
        boolean [] prime = new boolean[n+1];

        Arrays.fill(prime, true);

        for(int i = 2; i*i<=n; i++){
            if(prime[i]){
                for(int j = i*i; j<=n; j = j+i){
                    prime[j] = false;
                }
            }
        }

        int primeCount = 0;
        for(int i = 2; i<=n; i++){
            if(prime[i] == true){
                primeCount++;
            }
        }
        return primeCount;
    }

    public long fact(int n){
        long factorial = 1;
        for(int i=2; i<=n; i++){
            factorial = (factorial * i)%mod;
        }
        return factorial;
    }
}