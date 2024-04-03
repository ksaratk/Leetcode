class Solution {
    public static final int mod = 1000000007;
    public int numPrimeArrangements(int n) {
        int prime = 0;
        for(int i = 1; i<=n; i++){
            if(isPrime(i) == true){
                prime++;
            }
        }
    int nonP = n - prime;
    long result = (factorial(prime) * factorial(nonP))%mod;
    return (int)result;
    }

    public long factorial(int x){
        long fact = 1;
        for(int i = 2; i<=x; i++){
            fact = (fact * i)% mod;
        }
        return fact;
    }

    public boolean isPrime(int x){
        if(x<=1) return false;
        for(int i=2; i*i<=x; i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
}