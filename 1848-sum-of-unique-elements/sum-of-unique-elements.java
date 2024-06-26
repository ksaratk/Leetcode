class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> m = new HashMap();
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
            if(m.get(nums[i]) == 1){
                sum+= nums[i];
            }else if(m.get(nums[i]) == 2){
                sum-= nums[i];
            }
        }

   return sum;
    }
}