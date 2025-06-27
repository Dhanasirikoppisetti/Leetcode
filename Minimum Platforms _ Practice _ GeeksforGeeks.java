// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms=1;
        int maxplatform=1;
        int n=arr.length;
        int i=1,j=0;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                platforms++;
                i++;
            }
            else
            {
                platforms--;
                j++;
            }
            maxplatform=Math.max(maxplatform,platforms);
        }
        return maxplatform;
    }
}
