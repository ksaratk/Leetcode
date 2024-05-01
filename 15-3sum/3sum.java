class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet();
        Set<Integer> tempSet = null;
        for(int i=0; i<nums.length; i++){
            int sum =0;
            tempSet = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                 sum = -(nums[i]+nums[j]);
                 if(tempSet.contains(sum)){
                     List<Integer> tempList = Arrays.asList(nums[i], nums[j], sum);
                     tempList.sort(null);
                     set.add(tempList);
                 }else{
                     tempSet.add(nums[j]);
                 }          
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}