class Solution {
    public String[] createGrid(int m, int n) {
        char [][] ch=new char[m][n];
        for(char[] row:ch){
            Arrays.fill(row,'#');
        }
        int r=0,c=0;
        ch[r][c]='.';
        while(r<m-1 || c<n-1){
            if(r<m-1 && c==n-1){
                r++;
            }else{
                c++;
            }ch[r][c]='.';

        }
        String[]  ans=new String[m];
        for(int i=0;i<m;i++){
            ans[i]=new String(ch[i]);
           
        }
        return ans;
    
}
}