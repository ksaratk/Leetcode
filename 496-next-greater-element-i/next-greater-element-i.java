class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] result = new int [nums1.length];

        for(int i=0; i<nums1.length; i++){
            int digit = binarySearch(nums1[i], nums2);
            result[i] = digit;
        }
        return result;

    }

    public int binarySearch(int value, int [] nums2){
        boolean flag = false;

        for(int i=0; i<nums2.length; i++){
            if(nums2[i]>value && flag==true){
                return nums2[i];
            } else if(nums2[i] == value){
                flag = true;
            }
        }
        return -1;
    }
}