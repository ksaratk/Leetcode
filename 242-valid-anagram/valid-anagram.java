class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
         String[] str1 = s.split("");
         String[] str2 = t.split("");
         Arrays.sort(str1);
         Arrays.sort(str2);
         if(Arrays.equals(str1, str2)) return true;
        return false;
    }
}