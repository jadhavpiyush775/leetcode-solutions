class Solution {
    public boolean isPalindrome(String s) {
        String s0=s.toLowerCase();
        String s1=s0.replaceAll("[^a-z0-9]","");
        char []arr=s1.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }else{
                i++;
                j--;
                
            }

        }
        return true;
    }
}