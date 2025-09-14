class Solution {
    public int maxArea(int[] height) {
        int max_height=0;
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
            int base=j-i;
            int h=Math.min(height[i],height[j]);
            int total_height=base*h;
            max_height=Math.max(max_height,total_height);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
            
        }
        return max_height;
    }
}