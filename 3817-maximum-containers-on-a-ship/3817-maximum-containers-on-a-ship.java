class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int c=n*n;
        int k=maxWeight/w;
        return Math.min(c,k);
        
    }
}