class Solution {
    public int maxSubArrayLen(int[] A, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int longest = 0;
        map.put(0, -1);
        for(int i=0; i<A.length; i++){
            sum += A[i];
            
            int rem = sum - k;
            if(map.containsKey(rem)){
                longest = Math.max(longest, i - map.get(rem));
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return longest;
    }
}