class Solution {
    public int reverse(int x) {
        
        long no = 0;

        while(x!=0){
            no = no*10 + x%10;
            x = x/10;
        }
        System.out.print(x);
    if(no>=Integer.MAX_VALUE || no<=Integer.MIN_VALUE){
        return 0;
    }
    return (int)no;
  }
}