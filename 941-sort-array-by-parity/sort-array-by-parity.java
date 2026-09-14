class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                swap(nums,start,i);
                start++;
            }
        }
        return nums;
    }
        static void swap(int []nums,int first,int second){
            int temp=nums[first];
            nums[first]=nums[second];
            nums[second]=temp;
        }
    }
