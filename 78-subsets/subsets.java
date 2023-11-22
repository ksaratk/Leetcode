class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();

        ans.add(new ArrayList<Integer>());

        for(int val : nums){
            int n = ans.size();

            for(int i = 0; i < n; i++){
                List<Integer> list = new ArrayList<>(ans.get(i));
                list.add(val);
                ans.add(list);
            } 
        }
        return ans;
    }
}