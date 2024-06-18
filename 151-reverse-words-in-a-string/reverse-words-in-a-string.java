class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        String[] ar = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=ar.length-1; i>0; i--){
            sb.append(ar[i]+" ");
        }
        sb.append(ar[0]);
        return String.valueOf(sb);
    }
}