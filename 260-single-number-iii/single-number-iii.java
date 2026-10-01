class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        int mask=xor&(-xor);
        int unique=0;
        int unique1=0;
        for(int j=0;j<nums.length;j++){
            if((nums[j]&mask)!=0){
                unique^=nums[j];
            }else{
                unique1^=nums[j];

        }
        }
        return new int[]{unique,unique1};
    }
}