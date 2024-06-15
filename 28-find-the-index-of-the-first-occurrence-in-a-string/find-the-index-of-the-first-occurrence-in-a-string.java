class Solution {
    public int strStr(String haystack, String needle) {
       int n = haystack.length();
       int m = needle.length();
        
        for(int start = 0; start<=n-m; start++){
            for(int i = 0; i<m; i++){
                if(needle.charAt(i) != haystack.charAt(start+i)){
                    break;
                }
                   if(i  == m-1) return start;
            }
        }
                   return -1;
    }
}