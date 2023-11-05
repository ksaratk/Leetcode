class Solution {
     public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            int count = 1;
            int number = nums[i];

            if(!set.contains(number-1)){
                while(set.contains(number+1)){
                    count++;
                    number = number+1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}