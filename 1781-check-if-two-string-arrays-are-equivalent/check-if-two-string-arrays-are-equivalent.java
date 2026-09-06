class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String sum1=String.join("",word1);
      String sum2=String.join("",word2);
      if(sum1.equals(sum2)){
        return true;
      }else{
        return false;
      }
            

        
    }
}