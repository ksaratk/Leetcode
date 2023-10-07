class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                Set<Long> tempSet = new HashSet();
                for(int k=j+1; k<nums.length; k++){
                  Long sum = (long)nums[i]+nums[j]+nums[k];
                  long rem = (long)target - sum;
                  if(tempSet.contains(rem)){
                      List<Integer> tempList =  Arrays.asList(nums[i],nums[j],nums[k], (int)rem);
                      tempList.sort(null);
                      set.add(tempList);
                  } 
                  tempSet.add((long)nums[k]);
              }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}