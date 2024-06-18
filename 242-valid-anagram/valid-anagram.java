class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)-1);
        }
        
        for(Character key : map.keySet()){
            if(map.get(key)!=0) return false;
        }
        return true;
    }
    
}