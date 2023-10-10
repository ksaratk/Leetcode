class Solution {
    public String reverseWords(String s) {
		s = s.replaceAll("\\s+", " ");
		String [] strArr = s.split(" ");
        String out = "";
		
        for(int i=strArr.length-1; i>=0; i--) {
			out += strArr[i]+" ";
		}
		return out.trim();
    }
}