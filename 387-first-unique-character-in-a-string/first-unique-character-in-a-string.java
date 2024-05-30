class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap();
        int ans = -1;
        for(char ch : s.toCharArray()){
            map.put(ch,  map.getOrDefault(ch, 0)+1);
        }
        
        for(char ch : map.keySet()){
            if(map.get(ch) == 1){
                ans = s.indexOf(ch);
                break;
            }
        }
        return ans;
    }
}