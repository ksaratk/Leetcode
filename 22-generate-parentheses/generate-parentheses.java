class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(n, n, "", list);
        return list;
    }
    
    public void helper(int open, int close, String ans, List<String> list){
	    	if(open == 0 && close == 0) {
	    		list.add(ans);
	    		return;
	    	}
	    	
	    	if(open<close) {
	    		helper (open, close-1, ans+")", list);
	    	}
	    	if(open!=0) {
	    		helper (open-1, close, ans+"(", list);	
	    	}    		    	
	    }
}