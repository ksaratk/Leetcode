class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, ans, 0, temp);
        return ans;
    }
    
    public void helper(int [] nums, List<List<Integer>> ans, int index, List<Integer> temp){
        ans.add(new ArrayList(temp));
       
        for(int i=index; i<nums.length; i++){
            if(i!=index && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            helper(nums, ans, i+1, temp);
            temp.remove(temp.size()-1);             
        }
    }
}