class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()) return ans;
        helper(digits, "", ans);
        return ans;
    }
    
    public void helper(String up, String p, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        
        int digit = Integer.parseInt(up.charAt(0)+"");
        int start = (digit - 2)*3;
        int end = (digit-1)*3;
        
        if(digit == 7){
            end +=1;
        } else if(digit == 8){
            start += 1;
            end += 1;
        } else if(digit == 9){
            start += 1;
            end += 2;
        }
        
        for(int i = start; i<end; i++){
            char ch = (char)(i+'a');
            helper(up.substring(1), p + ch, list);
        }
    }
}