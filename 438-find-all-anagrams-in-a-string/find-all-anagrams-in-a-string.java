class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> map = null;
        int [] ar = null;
        for(int i=0; i<=s.length()-p.length(); i++){
           ar = new int [26];
            int flag = 1;
             for(int j=0; j<p.length(); j++){
                 ar[p.charAt(j) - 'a']++;
                 ar[s.charAt(j+i) - 'a']--;
             }
            for(int k=0; k<26; k++){
                if(ar[k]!=0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                ans.add(i);
            }
        }
        return ans;
    }
}