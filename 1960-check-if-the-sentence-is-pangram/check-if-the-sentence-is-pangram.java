class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int [] ans =new int [26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            ans[ch-'a']++;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0){
                return false;
            }
        }
        return true;

        }
        
    }
