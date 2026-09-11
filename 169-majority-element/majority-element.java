class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count =0;
        for(int i=0;i<n;i++){
            boolean swapped =false;
            for(int j=1;j<=n-1;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped =true;
                }
            }
            if(!swapped){
                break;
            }
        }
        int i=0;

            for(int j=0;j<n;j++){
                 if(nums[i]==nums[j]){
                    count++;
                 }
            
            if(count>n/2){
                return nums[i];
            }i=j;}
        
        return 0;
    }
}