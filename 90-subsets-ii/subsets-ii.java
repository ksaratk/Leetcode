class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList();
        int start=0;
        int end = 0;
        outer.add(new ArrayList<Integer>());
        for(int j=0; j<nums.length; j++){
            int n = outer.size();
            start = 0;
            if(j>0 && nums[j-1] == nums[j]){
                start = end + 1;
            }
        end = outer.size() - 1;
            for(int i=start; i<n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(nums[j]);
                outer.add(inner);
            }
        }
        return outer;
    }
}