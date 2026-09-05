class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j++;
        }
       for(int i=0;i<nums1.length;i++){
        boolean swap=false;
        for(int k=1;k<=nums1.length-1;k++){
            if(nums1[k-1]>nums1[k]){
                int temp=nums1[k-1];
                nums1[k-1]=nums1[k];
                nums1[k]=temp;
                swap=true;

            }

        }
        if(!swap){
            break;
        }
       }
       
    }
    
}