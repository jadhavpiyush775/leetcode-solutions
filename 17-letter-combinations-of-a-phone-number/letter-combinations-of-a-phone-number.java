class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> ans=new ArrayList<String>();
        helper("", digits, ans);
        return ans;
    }
    static void helper(String p,String digits,List<String> ans){
        if(digits.isEmpty()){
            ans.add(p);
            return;
            
        }
        int n=digits.charAt(0)-'0';
     
       
        if (n == 7) {
            for (int i = (n - 2) * 3; i <= (n - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                helper(p + ch, digits.substring(1), ans);
            }
        } else if (n == 9) {
            for (int i = 22; i <= 25; i++) {
                char ch = (char) ('a' + i);
                helper(p + ch, digits.substring(1), ans);
            }
        } else if (n == 8) {
            for (int i = ((n - 2) * 3) + 1; i <= (n - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                helper(p + ch, digits.substring(1), ans);
            }
        } else {
            for (int i = (n - 2) * 3; i < (n - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                helper(p + ch, digits.substring(1), ans);
            }
        }
    }
}
