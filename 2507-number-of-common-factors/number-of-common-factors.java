class Solution {
    public int commonFactors(int a, int b) {
         int min = Integer.min(a,b);
         int count = 0;
         int fact = 1;
         while(fact<=min){
            if(a%fact == 0 && b%fact == 0 ){
                count++;
            }
            fact = fact+1;
         }
         
         return count;
    }
}