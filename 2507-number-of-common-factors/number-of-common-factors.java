class Solution {
    public int commonFactors(int a, int b) {
        int min = gcd(a, b);
        int count = 0;
        for(int i=1 ; i*i<=min; i++){
            if(min%i == 0){
             if(min/i == i){
                count++;
             }else{
                count+=2;
             }
           }
        }   
        return count;
    }

    public int gcd(int a, int b){
        if(b==0) return a;

        return gcd(b, a%b);
    }
}