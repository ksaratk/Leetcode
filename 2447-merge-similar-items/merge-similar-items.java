class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        int [] arr = new int [1001];
        
        for(int i=0; i<items1.length; i++){
            int [] ar = items1[i];
            arr[ar[0]] = ar[1];
        }
        
         for(int i=0; i<items2.length; i++){
            int [] ar = items2[i];
            if(arr[ar[0]] != 0){
                 arr[ar[0]] = arr[ar[0]]+ar[1];
            } else{
             arr[ar[0]] = ar[1];
            }
        }
        
         for(int i=0; i<1001; i++){
            if(arr[i]!=0){
                ans.add(Arrays.asList(i, arr[i]));
            }
        }
        return ans;
    }
}