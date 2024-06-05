class Solution {
    public String reverseWords(String s) {
        String []  ar = s.split("\\s+");
        for(int i=0; i<ar.length/2; i++){
            String temp = ar[i];
            ar[i] = ar[ar.length-i-1];
            ar[ar.length-i-1] = temp;
        }
        
        String s2 = "";
        for(int i=0; i<ar.length; i++){
            s2 += ar[i]+" ";
        }
        return s2.trim();
    }
}