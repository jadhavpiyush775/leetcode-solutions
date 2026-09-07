class Solution {
    public boolean isPalindrome(String s) {
String s0=s.toLowerCase();
       String s1=s0.replaceAll("[^a-z0-9]","");
       String s2=String.join("",s1);

       if(s==null ||s.length()==0){
        return true;
       }
       for(int i=0;i<s2.length()/2;i++){
        int start=s2.charAt(i);
        int end=s2.charAt(s2.length()-1-i);
        if(start!=end){
            return false;
        }
       }
       return true;
    }
}