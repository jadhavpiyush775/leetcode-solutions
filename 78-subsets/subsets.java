class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
       helper(nums,0,new ArrayList<Integer>(),ans);
    return ans;
    }
    static void helper(int[]nums,int index,ArrayList<Integer> current,List<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
        
        return ;
        }
        current.add(nums[index]);
        helper(nums,index+1,current,ans);

        current.remove(current.size()-1);

         helper(nums,index+1,current,ans);
    }
}