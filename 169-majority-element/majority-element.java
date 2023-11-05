class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();

       for(int i=0; i<nums.length; i++){
           int value = map.getOrDefault(nums[i], 0);
           map.put(nums[i], value+1);
       }

       for(int key : map.keySet()){
           if(map.get(key)>nums.length/2){
               return key;
           }
       }
       return -1;
    }
}