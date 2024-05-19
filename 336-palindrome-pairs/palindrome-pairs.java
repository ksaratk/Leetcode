class Solution {
   public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        if (words == null || words.length < 2) return ans;

        // Create a map to store word to its index
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        // Check each word for palindrome pairs
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <= words[i].length(); j++) {
                String left = words[i].substring(0, j);
                String right = words[i].substring(j);

                if (isPalindrome(left)) {
                    String reversedRight = new StringBuilder(right).reverse().toString();
                    if (map.containsKey(reversedRight) && map.get(reversedRight) != i) {
                        ans.add(Arrays.asList(map.get(reversedRight), i));
                    }
                }

                if (right.length() != 0 && isPalindrome(right)) { // Avoid duplicates
                    String reversedLeft = new StringBuilder(left).reverse().toString();
                    if (map.containsKey(reversedLeft) && map.get(reversedLeft) != i) {
                        ans.add(Arrays.asList(i, map.get(reversedLeft)));
                    }
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}