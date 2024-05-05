class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase().replaceAll(" ","").trim();
        t = t.toLowerCase().replaceAll(" ","").trim();
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}