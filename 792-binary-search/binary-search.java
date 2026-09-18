class Solution {
    public int search(int []nums,int target){
    return binarysearch( nums,target,0,nums.length-1) ;
    }
    private int binarysearch(int []nums,int target,int start,int end){
    if(start>end){
        return -1;
    }
        int mid=start+(end-start)/2 ;
        if(target==nums[mid]){
            return mid;
        }else if(nums[mid]>target){
            return binarysearch(nums,target,start,mid-1);
        }    else{
            return binarysearch(nums,target,mid+1,end);
        }
            
        
    }
    
}