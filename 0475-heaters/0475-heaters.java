class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int max_range=0;
        for(int i=0;i<houses.length;i++)
        {
            int min_dist = Integer.MAX_VALUE;
            for(int j=0;j<heaters.length;j++)
            {
                int range=Math.abs(houses[i]-heaters[j]);
                min_dist=Math.min(range,min_dist);

            }
            max_range=Math.max(max_range,min_dist);
        }
        return max_range;
    }
}