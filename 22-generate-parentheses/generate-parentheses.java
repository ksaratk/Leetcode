class Solution {
    public List<String> generateParenthesis(int n) {
				int open = n;
				int close = n;
				List<String> result = new ArrayList();
        helper(open, close, "", result);
        return result;
	}

	private void helper(int open, int close, String string, List<String> list) {
		// TODO Auto-generated method stub
			if(open==0 && close ==0) {
				list.add(string);
				return;
			}
			
			if(open!=0) {
				String st1 = string;
				st1 += "(";
				helper(open-1, close, st1, list);
			}
			if(open<close) {
				String st2 = string;
				st2 += ")";
				helper(open, close-1, st2, list);
			}
	}
}