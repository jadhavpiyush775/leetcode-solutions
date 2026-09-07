class Solution {
    public boolean halvesAreAlike(String s) {
        String s1=s.toLowerCase();
        String a=s1.substring(0,s1.length()/2);
        String b=s1.substring(s1.length()/2,s1.length());
            String a1=a.replaceAll("[^aeiou]","");
            String b1=b.replaceAll("[^aeiou]","");
            if(a1.length()==b1.length()){
                return true;
            }
            return false;
    }
}