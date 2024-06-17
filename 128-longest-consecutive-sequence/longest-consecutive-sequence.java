class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int count = 1;
                int num = nums[i];
                
                while(set.contains(num+1)){
                    count++;
                    num = num+1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}