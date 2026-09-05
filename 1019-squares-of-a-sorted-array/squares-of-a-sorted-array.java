class Solution {
    public int[] sortedSquares(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[j]*nums[j];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            boolean swap=false;
            for(int k=1;k<=nums.length-1;k++){
                if(nums[k-1]>nums[k]){
                    int temp=nums[k-1];
                    nums[k-1]=nums[k];
                    nums[k]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        return nums;
    }}
