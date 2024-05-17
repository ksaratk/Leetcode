class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;        
        int count = 1;
        for(Integer value : set){
             if(!set.contains(value-1)){
                value = value+1;     
                 while(set.contains(value)){
                     count++;
                     value = value + 1;
                 }
                 max =  Math.max(max, count);
             }
            count = 1;
        }
        return max;
    }
}