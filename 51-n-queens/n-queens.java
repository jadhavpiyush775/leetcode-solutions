class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        boolean [][]board=new boolean[n][n];
        nqueens(board,0,ans);
        return ans;

    }
    static void nqueens(boolean [][]board,int r,List<List<String>> ans){
        if(r==board.length){
            display(board,ans);
            return ;
        }
        for(int c=0;c<board.length;c++){
            if(issafe(board, r, c)){
                board[r][c]=true;
                nqueens(board,r+1,ans);
                board[r][c]=false;
                            }
        }
    }


    static boolean issafe(boolean[][] board,int r,int c){
        //vertically()
        for(int i=0;i<r;i++){
            if(board[i][c]){
                return false;
            }
        }
        //digonally laft
        int maxleft=Math.min(r,c);
        for(int i=1;i<=maxleft;i++){
            if(board[r-i][c-i]){
            return false;
        }
    }
    //digonally right
int maxright=Math.min(r,board.length-1-c);
for(int i=1;i<=maxright;i++){
if(board[r-i][c+i]){
    return false;
}
}
return true;
}



    static void display(boolean [][]board,List<List<String>> ans){
        List<String> current=new ArrayList<String>();
        for(boolean[] row:board){
            StringBuilder s=new StringBuilder();
            for(boolean element:row){
                if(element){
                    s.append("Q");
                }else{
                    s.append(".");
                }
            }
            current.add(s.toString());
                    }
                    ans.add(current);

    }
}