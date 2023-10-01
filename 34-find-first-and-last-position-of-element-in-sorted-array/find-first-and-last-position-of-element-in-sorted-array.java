class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int f = first(nums, target);
        int l = last(nums, target);

        return new int []{f,l};

    }

    public int first(int [] nums, int x){
        int ans = -1;
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]==x){
                ans = mid;
                high = mid-1;
            } else if(nums[mid]>x){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return ans;
    }

    public int last(int [] nums, int x){
        int ans = -1;
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]==x){
                ans = mid;
                low = mid+1;
            } else if(nums[mid]>x){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return ans;
    }
}