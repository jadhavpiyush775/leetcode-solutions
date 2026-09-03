class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1){
            return;
        }
        int nonzeroindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonzeroindex]=nums[i];
                nonzeroindex++;
            }
        }
        while(nonzeroindex<nums.length){
            nums[nonzeroindex]=0;
            nonzeroindex++;
        }
}}