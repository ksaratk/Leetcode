class Solution {
    public int alternateDigitSum(int n) {
        
        int reverse = 0;
        while(n>0){
            reverse = reverse*10 + n%10;
            n = n/10;
        }
        int flag = 0;
        int result = 0;
        while(reverse>0){
            if(flag == 0){
                result += reverse%10;
            }else{
                result = result+(-1*reverse%10);
            }
            reverse = reverse/10;
            flag = 1-flag;
        }
        return result;
    }
}