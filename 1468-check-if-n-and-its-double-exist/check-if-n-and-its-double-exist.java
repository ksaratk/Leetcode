class Solution {
    public boolean checkIfExist(int[] arr) {
       Map <Integer, Integer> m = new HashMap<>();
        for(int i= 0; i<arr.length; i++){
           m.put(arr[i], i);
        }
        for(int i= 0; i<arr.length; i++){
           if(m.containsKey(arr[i]*2) && m.get(arr[i]*2)!=i){
               return true;
           }
        }
        return false;
    }
}