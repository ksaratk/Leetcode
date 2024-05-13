class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        ans.add(new ArrayList());
        int start = 0;
        int end = 0;
        for(int i=0; i<nums.length; i++){
            int range = ans.size();
            start = 0;
            if(i>0 && nums[i]==nums[i-1]){
                start = end + 1;
            }
            end = range-1;
            // List<List<Integer>> list= new ArrayList<>();
            for(int j=start; j<range; j++){
                List<Integer> tempList = new ArrayList<>(ans.get(j));
                tempList.add(nums[i]);
                ans.add(tempList);
            }
            // ans.addAll(list);
        }
        return ans;
    }
}