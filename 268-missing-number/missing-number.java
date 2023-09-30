class Solution {
    public int missingNumber(int[] nums) {
        int max = Integer.MIN_VALUE;
        int missing = 0;
		// for(int i=0; i<nums.length; i++) {
		// 	max= Math.max(max, nums[i]);
		// }
		int [] temp = new int[nums.length+1];
		for(int i=0; i<nums.length; i++) {
			temp[nums[i]] = 1;
		}
		
		for(int i=1; i<temp.length; i++) {
			if(temp[i]==0) {
				missing = i;
			}
		}
        return missing;
    }
}