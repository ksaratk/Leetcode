class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n  = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j<n; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                
                while(k<l){
                    long sum = (long)nums[i] + nums[j] + nums[k];
                         sum += (long)nums[l];
                if(sum>target){
                    l--;
                }else if(sum<target){
                    k++;
                } else {
                    List<Integer> tempList = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                    list.add(tempList);
                    l--;
                    k++;
                    
                    while(nums[k] == nums[k-1] && k<l) k++;
                    while(nums[l] == nums[l+1] && k<l) l--;
                }
              }
            }
        }
        return list;
    }
}