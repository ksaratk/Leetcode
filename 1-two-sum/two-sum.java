class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
        int [] ar = new int[2];
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans = target - nums[i];
            
            if(map.containsKey(ans)){
                ar[0] = i;
                ar[1] = map.get(ans);
            } else{
                map.put(nums[i], i); 
            }
        }
        return ar;
    }
}