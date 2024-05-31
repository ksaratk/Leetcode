class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 1;
        String curr = "";
        int longest = 0;
        
        for(int right = 0; right<s.length(); right++){
            
            while(curr.contains(Character.toString(s.charAt(right)))){
              curr =  curr.substring(1);
            }
            curr += s.charAt(right);            
            longest = Math.max(longest, curr.length());
        }
        return longest;
    }
}