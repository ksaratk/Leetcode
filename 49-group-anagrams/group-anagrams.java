class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> m = new HashMap();
        for (String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String s2 = new String(ch);
            m.putIfAbsent(s2, new ArrayList<String>());
            m.get(s2).add(s);
        }
        
        for(Map.Entry<String, List<String>> entry : m.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}