class Solution {
    public int fib(int n) {
        if(n == 0) return n;
      return findFib(n);   
    }
    
    public int findFib(int n){
        if(n == 1){
            return n;
        }
        
     return findFib(n-1) + fib(n-2);
    }
}