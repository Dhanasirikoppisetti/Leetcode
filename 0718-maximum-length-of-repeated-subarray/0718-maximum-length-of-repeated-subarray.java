class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int count=0;
        int max_len=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                int arr1=i;
                int arr2=j;
                count=0;
                while(arr1<nums1.length && arr2<nums2.length && nums1[arr1]==nums2[arr2])
                {
                    count++;
                    arr1++;
                    arr2++;
                }
                max_len=Math.max(max_len,count);
            }
        }
        return max_len;
    }
}