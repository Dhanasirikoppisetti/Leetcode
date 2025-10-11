class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int left=0;
      int right=(nums.length+1)/2;
      while(right<nums.length)
      {
        if(nums[left]*2<=nums[right]) left++;
        right++;
      }
      return 2*left;
    }
}