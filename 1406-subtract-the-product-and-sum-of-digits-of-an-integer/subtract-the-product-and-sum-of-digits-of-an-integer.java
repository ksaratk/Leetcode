class Solution {
    public int subtractProductAndSum(int n) {
       int sum = 0;
       int product = 1;

       while(n>0){
        int number = n%10;
        n/=10;
        sum += number;
        product *= number;
       }

        return product-sum;
    }
}