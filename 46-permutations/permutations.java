class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       helper(new ArrayList<>(), nums, 0, ans);
       return ans;
    }
    static void helper(ArrayList<Integer> p,int []nums, int index,List<List<Integer>> ans){
        if(index==nums.length){
           ans.add(new ArrayList<>(p));
            return ;
        }
        int num=nums[index];
        for(int i=0;i<=p.size();i++){
            ArrayList<Integer> f=new ArrayList<Integer>(p);
            f.add(i,num);
            helper(f,nums,index+1,ans);
        }

        
    }
}