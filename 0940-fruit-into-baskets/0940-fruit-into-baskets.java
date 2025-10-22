class Solution {
    public int totalFruit(int[] fruits) {
        int last=-1;
        int second_last=-1;
        int last_count=0;
        int current_max=0;
        int maximum=0;
        for(int i=0;i<fruits.length;i++)
        {
            int fruit=fruits[i];
        if(fruit==last||fruit==second_last)
        {
            current_max++;
        }
        else
        {
            current_max=last_count+1;
        }
        if(fruit==last)
        {
            last_count++;
        }
        else
        {
            last_count=1;
            second_last=last;
            last=fruit;
        }
        maximum=Math.max(maximum,current_max);
        }
         return maximum;
    }
}