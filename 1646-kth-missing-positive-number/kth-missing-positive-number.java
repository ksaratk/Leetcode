class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int n = arr.length;
        int max = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }

        int count = 0;
        for(int i=1; i<max; i++){
            if(missing(arr, i, n)){
                count++;
            }
            if (count==k) return i;
        }
        return -1;
    }

    public boolean missing(int [] arr, int value, int n){
        
        for(int i=0; i<n; i++){
            if(arr[i]==value){
                return false;
            }
        }
        return true;
    }
}