class Solution {
    public int[] sortedSquares(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[j]*nums[j];
            j++;
        }
        Arrays.sort(nums);
                return nums;
    }}
