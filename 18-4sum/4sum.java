class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n  = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                Set<Long> tempSet = new HashSet<>();
                for(int k=j+1; k<n; k++){
                        long cal = (long)nums[i] + nums[j] + nums[k];
                        long sum = target - cal;
                        if(tempSet.contains(sum)){
                            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], (int)sum);
                            list.sort(null);
                            set.add(list);
                        }else{
                            tempSet.add((long)nums[k]);
                        }
                }
            }
        }
        List<List<Integer>>  list = new ArrayList<>(set);
        return list;
    }
}