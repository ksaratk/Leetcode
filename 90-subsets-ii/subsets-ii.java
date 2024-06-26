class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, ans, 0, list);
        return ans;
    }
    
    public void helper(int [] nums, List<List<Integer>> ans, int index, List<Integer> list){
        ans.add(new ArrayList(list));
        
        for(int i = index; i<nums.length; i++){
            if(i>index && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            helper(nums, ans, i + 1, list);
            list.remove(list.size()-1);
        }
    }
}