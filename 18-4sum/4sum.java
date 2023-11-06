class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        Set<Long> tempSet = null;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                long sum = 0;
                tempSet = new HashSet();
                for(int k=j+1; k<n; k++){
                     sum = (long)nums[i]+nums[j]+nums[k];
                     long rem = target-sum;
                        if(tempSet.contains(rem)){
                        List<Integer> tempList = Arrays.asList(nums[i],nums[j],nums[k], (int)rem);
                        tempList.sort(null);
                        set.add(tempList);
                     } else{
                         tempSet.add((long)nums[k]);
                     }
                }
            }
        }
        List<List<Integer>> list = new ArrayList(set);
        return list;
    }
}