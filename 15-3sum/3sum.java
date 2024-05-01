class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<n; i++){
             Set<Integer> temp = new HashSet<>();
            for(int j=i+1; j<n; j++){
                    int sum = -(nums[i]+nums[j]);
                    if(temp.contains(sum)){
                        List<Integer> list = Arrays.asList(nums[i],nums[j], sum);
                        list.sort(null);
                        set.add(list);
                    }else{
                        temp.add(nums[j]);
                    }
            }
        }
        List<List<Integer>> result = new ArrayList<>(set);
        return result;
    }
}