class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
       for(int i=0; i<strs.length; i++){
           char [] ch = strs[i].toCharArray();
           Arrays.sort(ch);
           String s = String.valueOf(ch);
           if(map.containsKey(s)){
               map.get(s).add(strs[i]);
           } else{
               List<String> temp =new ArrayList();
               temp.add(strs[i]);
               map.put(s, temp);
           }
       }
         for(String key : map.keySet()){
             ans.add(map.get(key));
         }
        return ans;
    }
}