class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int gcdValue = gcd(a, b);
        for(int i=1; i*i<=gcdValue; i++){
           if(gcdValue%i == 0){
             if(gcdValue/i == i){
                count++;
             }else{
                count+=2;
             }
           }
        }
        return count;
    }

    public int gcd(int a, int b){
        if(b == 0) return a;
        
        return gcd(b, a%b);
    }
}