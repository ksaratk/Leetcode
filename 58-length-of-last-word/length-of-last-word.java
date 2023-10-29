class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String [] ar = s.split(" ");
        String word = ar[ar.length-1];
        return word.length();
    }
}