class Solution {
    public int commonFactors(int a, int b) {
         
         int count = 0;
         int gcd = findGcd(a,b);
         for(int i =1; i*i<=gcd; i++){
            if(gcd%i == 0){
                if(gcd/i == i){
                    count++;
                }else{
                    count+=2;
                }
            }
         }
         return count;
    }

    public int findGcd(int a, int  b){
        if(b==0) return a;

        return findGcd(b, a%b);
    }
}