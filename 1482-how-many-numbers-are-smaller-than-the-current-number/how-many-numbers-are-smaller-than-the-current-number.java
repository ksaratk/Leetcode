class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
                                     
        for(int i=0; i<nums.length; i++){
            int count = 0;
            int value = nums[i];
            for(int key : map.keySet()){
                if(key<value){
                    count += map.get(key);
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}