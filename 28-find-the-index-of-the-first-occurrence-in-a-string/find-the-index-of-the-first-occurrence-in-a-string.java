class Solution {
    public int strStr(String haystack, String needle) {
        
        int ans = -1;
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return ans;
    }
}