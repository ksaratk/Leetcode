class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        key = key.replaceAll(" ", "").trim();
        int i = 0;
        for(char ch : key.toCharArray()){
            if(!map.containsKey(ch)){
                 map.put(ch, (char) ('a' + i));
                 i++;
            }
        }
        
        String decode = "";
        for(char ch : message.toCharArray()){
            if(ch == ' ') {
                decode += " ";
            } else {
                decode += map.get(ch);
            }
        }
        return decode;
    }
}