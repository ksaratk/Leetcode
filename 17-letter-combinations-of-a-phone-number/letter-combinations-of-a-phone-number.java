class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList();
        List<String> result  = helper("", digits, new ArrayList<String>());
        return result;
    }

    public List<String> helper(String p, String up, List<String> result){
        if(up.isEmpty()){
            result.add(p);
            return result;
        }

        int digit = up.charAt(0) - '0';

        int start = (digit-2)*3;
        int limit = (digit-1)*3;
        
        if(digit == 8 || digit == 9) start = start+1;
        if(digit == 8 || digit == 7) limit = limit+1;
        if(digit == 9) limit = limit+2;
        

        for(int i = start; i<limit; i++){
            char ch = (char)(i + 'a');
            helper(p+ch, up.substring(1), result);
        }
        return result;
    }
}