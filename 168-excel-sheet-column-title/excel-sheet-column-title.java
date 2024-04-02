class Solution {
    public String convertToTitle(int columnNumber) {
        
        if(columnNumber <= 26){
            return (char)('A' - 1 + columnNumber)+"";
        }
        StringBuilder ans = new StringBuilder("");

        while(columnNumber > 0){
            if(columnNumber % 26 == 0){
                ans = ans.append("Z");
                columnNumber = columnNumber - 1;
            } else {
                ans = ans.append((char)('A' - 1 + (columnNumber%26)));
            }

            columnNumber = columnNumber/26;
        }
        return ans.reverse().toString();
    }
}