class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        int m1 = 0;
        int m2 = 0;
        int k = 0;
        while(k <= (n + m)/2){
            m2 = m1;
            if(i<n && j<m){
                if(nums1[i] < nums2[j]){
                    m1 = nums1[i];
                    i++;
                } else{
                    m1 = nums2[j];
                    j++;
                }
            }else if(i<n){
                m1 = nums1[i];
                    i++;
            }else {
                m1 = nums2[j];
                    j++;
            }
            k++;
        }
        
        if((n+m)%2 == 1) return m1;
        System.out.println(m1 +  " " + m2);
        return (m1+m2)/2.0;
    }
    
}