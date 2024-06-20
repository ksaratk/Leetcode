class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        // Storing the difference of frequencies of characters in t and s.
        for (int i = 0; i < s.length(); i++) {
            count[t.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
        }

        int ans = 0;
        // Adding the difference where string t has more instances than s.
        // Ignoring where t has fewer instances as they are redundant and
        // can be covered by the first case.
        for (int i = 0; i < 26; i++) {
            if(count[i]>0)ans +=count[i];}

        return ans;
    }
}