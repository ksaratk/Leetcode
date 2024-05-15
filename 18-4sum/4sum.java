class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<nums.length; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int n = nums.length - 1;
                
                while(k<n){
                    long x = nums[i] + nums[j];
                    long sum = x + nums[k] + nums[n];
                        
                    if(sum > target){
                        n--;
                    } else if(sum < target){
                        k++;
                    } else {
                        
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[n]);
                        set.add(list);
                        k++;
                        n--;
                        
                        while(k<n && nums[k]==nums[k-1]) k++;
                        while(k<n && nums[n]==nums[n+1]) n--;
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}