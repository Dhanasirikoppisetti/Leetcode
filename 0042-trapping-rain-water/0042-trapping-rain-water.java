class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int lm=0;
        int rm=0;
        int ans=0;
        while(left<right)
        {
              if(height[left]<height[right])
              {
                lm=Math.max(lm,height[left]);
                ans+=lm-height[left];
                left++;
              }
              else
              {
                rm=Math.max(rm,height[right]);
                ans+=rm-height[right];
                right--;
              }
        }
        return ans;
    }
}