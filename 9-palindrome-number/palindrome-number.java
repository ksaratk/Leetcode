class Solution {
    public boolean isPalindrome(int x) {
        
        int newNumber = reverse(x);
        if(newNumber == x){
            return true;
        }

        return false;
    }

    public int reverse(int x){
        int newNumber = 0;

        while(x>0){
            newNumber  =  newNumber * 10 + x%10;
            x = x/10;
        }
        return newNumber;
    }
}