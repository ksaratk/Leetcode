class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1  = nums1.length;
        int n2  = nums2.length;
        int [] temp = new int[n1 + n2];

        int i =0;
        int j =0;
        int k =0;
       while(i<n1 && j<n2){
           if(nums1[i] < nums2[j]){
               temp[k] = nums1[i];
               k++;
               i++;
           } else{
               temp[k] = nums2[j] ;
               k++;
               j++;
           }
       }

       while(i<n1){
            temp[k] = nums1[i];
               k++;
               i++;
       }

       while(j<n2){
           temp[k] = nums2[j];
               k++;
               j++;
       }
        int n = temp.length;
        System.out.println(n);
       if(n%2==1) {
           return  temp[n/2];
       } 
          double result = ((double) temp[n/2] + (double) temp[(n/2)-1])/2.0;
        //    ((double) arr3.get(n / 2) + (double) arr3.get((n / 2) - 1)) / 2.0;
        return result;
    }
}