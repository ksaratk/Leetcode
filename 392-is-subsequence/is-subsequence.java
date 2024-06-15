class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        for(int i = 0; i<s.length(); i++){
            int flag = 0;
            for(int j=k; j<t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    k = j+1;
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return false;
        }
        return true;
    }
}