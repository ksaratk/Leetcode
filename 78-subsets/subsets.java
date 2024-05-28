class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(nums, ans, 0, list);
        return ans;
    }
    
    public void helper(int [] nums, List<List<Integer>> ans, int index, List<Integer> list){
       if (index == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
    
        // Include the current element and move to the next
        list.add(nums[index]);
        helper(nums, ans, index + 1, list);
        list.remove(list.size() - 1); // Backtrack to remove the current element
        helper(nums, ans, index + 1, list);

    }
}