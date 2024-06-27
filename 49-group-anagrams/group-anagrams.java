class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();
        int[] count = new int[26];
        for (String s : strs) {
           Arrays.fill(count, 0);
           for(char ch : s.toCharArray()){
               count[ch-'a']++;
           }
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String s2 = String.valueOf(sb);
            m.putIfAbsent(s2, new ArrayList<String>());
            m.get(s2).add(s);
        }
        
        for(Map.Entry<String, List<String>> entry :  m.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}


