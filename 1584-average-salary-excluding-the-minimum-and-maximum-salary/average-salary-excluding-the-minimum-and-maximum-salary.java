class Solution {
    public double average(int[] salary) {
        int max=salary[0];
        int min=salary[0];
        int sum=salary[0];
        for(int i=1;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }
            sum+=salary[i];
        }
        sum=sum-max-min;
        double avg=(double)sum/(salary.length-2);
    return avg;
}}