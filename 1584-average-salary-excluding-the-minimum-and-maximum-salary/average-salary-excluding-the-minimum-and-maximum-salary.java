class Solution {
    public double average(int[] salary) {
       int sum=0;
       double avg=0.0;
       Arrays.sort(salary);
       for(int i=1;i<salary.length-1;i++){
        sum+=salary[i];
    

       } avg=(double)sum/(salary.length-2);
       return avg;
    }
}