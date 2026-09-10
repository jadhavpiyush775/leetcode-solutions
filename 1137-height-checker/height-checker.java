class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int []expected=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            expected[i]=heights[i];
            }
            sort(expected);
            for(int j=0;j<n;j++){
                if(expected[j]!=heights[j]){
                    count++;
                }
            }
            return count;
    }

    static void sort(int []expected){
       for(int i=0;i<expected.length-1;i++){
        int min=i;
        for(int j=i+1;j<expected.length;j++){
            if(expected[j]<expected[min]){
                min=j;
            }
        }swap(expected,i,min);
    }
    }
    static void swap(int []expected,int first,int second){
        int temp=expected[first];
        expected[first]=expected[second];
        expected[second]=temp;
    }
}