class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap();
        char i = 'a';
        map.put(' ', ' ');
        key = key.replaceAll(" ", "");
        for(char ch : key.toCharArray()){
            if(!(map.containsKey(ch))){
                map.put(ch, i++);                
            }
        }
        StringBuilder decode = new StringBuilder();
        for(char ch : message.toCharArray()){
            decode.append(map.get(ch));
        }
        return String.valueOf(decode);
    }
}