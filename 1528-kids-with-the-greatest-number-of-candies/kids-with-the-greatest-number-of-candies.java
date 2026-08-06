class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
       int n= candies.length;
        List<Boolean> ans=new ArrayList<Boolean>();
    
        int max=0;
       
        for(int i=0;i<n;i++){
           if(candies[i]>max){
            max=candies[i];
           }}
           for(int i=0;i<n;i++){
            int potentialcandies=candies[i]+extraCandies;
            if(potentialcandies>=max)  {
                ans.add(true);
            }
            else{
                ans.add(false);
            }
           }
           return ans;
        
        }
    }
