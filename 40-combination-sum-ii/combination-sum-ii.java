class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates array
        generateSubsets(candidates,0, new ArrayList<Integer>(),result ,target, 0);
        return result;
    }

    public void generateSubsets(int[] nums, int index, ArrayList<Integer> currentSubset, List<List<Integer>> list, int target, int sum) {
	    	if(sum==target) {
	    		list.add(new ArrayList<>(currentSubset));
                return;
	    	}

            if(sum>target){
                return;
            }   
	    	for(int i=index; i<nums.length; i++) {
	    		if(i>index && nums[i]==nums[i-1]) continue;
	    		currentSubset.add(nums[i]);
	    		sum+= nums[i];
	    		generateSubsets(nums, i+1, currentSubset, list, target, sum);
	    		currentSubset.remove(currentSubset.size()-1);
	    		sum-= nums[i];
	    	} 
	    	
	    }
}

