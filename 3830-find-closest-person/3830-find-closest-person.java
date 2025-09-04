class Solution {
    public int findClosest(int x, int y, int z) {
        int disx=Math.abs(z-x);
        int disy=Math.abs(z-y);
        if(disx<disy)
        {
            return 1;
        }
        else if(disx>disy)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }
}