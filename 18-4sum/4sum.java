class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>  result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
           if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1; j<nums.length; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

            int k = j+1;
            int l = nums.length-1;
            while(k<l){
                long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                if(sum>target){
                    l--;
                } else if(sum<target){
                    k++;
                }else{
                   List<Integer> list =  Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                   result.add(list);
                   k++;
                   l--;
                    
                   while(nums[k]==nums[k-1] && k<l){k++;}
                   while(nums[l]==nums[l+1] && k<l){l--;}
                }
            }
        } 
    }
        return result; 
    }
}