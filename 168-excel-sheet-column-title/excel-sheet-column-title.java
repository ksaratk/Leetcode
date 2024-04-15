class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder("");

        if(n<=26){
          result = result.append((char)('A' - 1 + n));
          return result.toString();
        }
        while(n>0){
            if(n%26 == 0){
                result = result.append("Z");
                n  = n-1;
            }else{
                result = result.append((char)('A' - 1 + n%26));
            }
            n = n/26;
        }
        return result.reverse().toString();
    }
}