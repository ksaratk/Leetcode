class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        helper("", n, n, list);
        return list;
    }

    public void helper(String p, int opning, int closing, List<String> ans){
        if(opning == 0 && closing == 0){
            ans.add(p);
            return;
        }
        
        if(opning>0){
            String s = p;
				s += "(";
            helper(s, opning-1, closing, ans);
        }  
        if(opning<closing){
            String s = p;
				s += ")";
            helper(s, opning, closing-1, ans);
        }
    }
}