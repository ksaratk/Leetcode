class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        int ans = 0;
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

        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
        return true;
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