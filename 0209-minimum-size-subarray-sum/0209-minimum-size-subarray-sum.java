class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_sub=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
         int right=0;
         while(right<nums.length)
         {
            sum+=nums[right];
            right++;
         while(sum>=target)
         {
            int window_size=right-left;
            min_sub=Math.min(min_sub,window_size);
            sum-=nums[left];
            left++;
         }
         }
         if(min_sub==Integer.MAX_VALUE)
         {
            return 0;
         }
         return min_sub;
    }
}