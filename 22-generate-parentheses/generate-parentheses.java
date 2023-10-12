class Solution {
    public List<String> generateParenthesis(int n) {
		int close = n;
		int open = n;
		List<String> list = new ArrayList<>();
		String op = "";
	  return balanceParenthisis(open, close, list, op);
	}
	
	public List<String> balanceParenthisis(int open, int close, List<String> list, String op){
		
		if(open==0 && close==0) {
		   list.add(op);
		   return list;
		}
		
		if(open!=0) {
			String op1 = op;
			op1 =  op+"(";
			balanceParenthisis(open-1, close, list, op1);
		} if(close>open) {
			String op2 = op;
			op2 =  op+")";
			balanceParenthisis(open, close-1, list, op2);
		}
		return list;
	}
}