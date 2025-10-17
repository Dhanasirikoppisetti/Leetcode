class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
            avg=sum/k;
        }
        double max_sum=sum;
        double maximum_avg=avg;
        int end=k;
        for(int i=1;i<=nums.length-k;i++)
        {
            sum=sum-nums[i-1]+nums[end];
            avg=(sum/k);
            maximum_avg=Math.max(maximum_avg,avg);
            end++;
        }
        return maximum_avg;
    }
}