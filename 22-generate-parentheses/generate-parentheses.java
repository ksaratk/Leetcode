class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans  = new ArrayList<>();
        helper(n, n, ans, "");
        return ans;
    }
    
    public void helper(int o, int c, List<String> ans, String p){
        if(o == 0 && c == 0){
            ans.add(p);
            return;
        }
        
        if(o<c){
            helper(o, c-1, ans, p+')');
        } 
        if (o>0){
            helper(o-1, c, ans, p+'(');
        }
    }
}