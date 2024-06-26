class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap();
        int i = 97;
        map.put(' ', ' ');
        for(char ch : key.toCharArray()){
            if(ch != ' ' && !(map.containsKey(ch))){
                map.put(ch, (char)i++);                
            }
        }
        String decode = "";
        for(char ch : message.toCharArray()){
            decode += map.get(ch);
        }
        return decode;
    }
}