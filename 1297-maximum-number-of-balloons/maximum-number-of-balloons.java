class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] ar = new int[5];
        for(char ch : text.toCharArray()){
            switch(ch){
                    case 'b': ar[0]++; break;
                    case 'a': ar[1]++; break;
                    case 'l': ar[2]++; break;
                    case 'o': ar[3]++; break;
                    case 'n': ar[4]++; break;
            }
        }
       int min1 =  Math.min(Math.min(ar[0], ar[1]), ar[4]);
       int min2 =  Math.min(ar[2]/2, ar[3]/2);
       return  Math.min(min1, min2);
    }
}