class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(helper(board,r,c,word)){
                    return true;
                }
            }
}   
return false; }
static boolean helper(char[][]board,int r,int c,String word){
    if(word.length()==0){
        return true;
    }
    if(r<0 || c<0 ||r>=board.length||c>=board[0].length){
        return false;
    }
   
    if(board[r][c]!=word.charAt(0)){
        return false;
    }
     char temp=board[r][c];

     board[r][c]='X';
    boolean ans=
    helper(board,r+1,c,word.substring(1))||
     helper(board,r,c+1,word.substring(1))||
      helper(board,r-1,c,word.substring(1))||
       helper(board,r,c-1,word.substring(1));

board[r][c]=temp;
return ans;
}
}