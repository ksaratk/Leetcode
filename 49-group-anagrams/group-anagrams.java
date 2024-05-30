class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){  //  O(n)
           int [] count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<26; i++){
                sb.append(count[i]);
                sb.append("$");
            }
            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

// O(n*k*log k)