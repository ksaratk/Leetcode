class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int no = reverse(n);
        int treaker = 0;
        while(no>0){
            int digit = no%10;
            if(treaker == 0){
                sum += digit;
                treaker = 1;
            } else{
                sum += -(digit);
                treaker = 0;
            }
            no/=10;
        }

        return sum;
    }

    public int reverse(int n){
        int no = 0;

        while(n>0){
            no = no*10 + n%10;
            n/=10;
        }
        return no;
    }
}