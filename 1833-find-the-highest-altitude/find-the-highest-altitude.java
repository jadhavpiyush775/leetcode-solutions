class Solution {
    public int largestAltitude(int[] gain) {
        int []ans=new int[gain.length+1];
        int sum=0;
         ans[0]=0;
        for(int i=0;i<gain.length;i++){
            
            sum+=gain[i];
            ans[i+1]=sum;
        } int max=0;
        for(int j=0;j<ans.length;j++){
            if(ans[j]>max){
                max=ans[j];
            }
           // return max;

        }
        return max;
    }
   
}