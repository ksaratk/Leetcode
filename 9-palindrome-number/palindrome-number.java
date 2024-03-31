class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int no = reverseNumber(x);

        if(no == x){
            return true;
        }
        return false;
    }

    public int reverseNumber(int x){

        int ans = 0;
        while(x>0){
            ans = ans*10 + x%10;
            x = x/10;
        }
        return ans;
    }
}