class Solution {
    public int missingNumber(int[] nums) {
    int unique=0;
    for(int i=0;i<=nums.length;i++){
        unique^=i;
    }    
    for(int j=0;j<nums.length;j++){
        unique^=nums[j];
    }
    return unique;
    }
    

}