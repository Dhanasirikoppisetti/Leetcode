class Solution {
    public long minimumSteps(String s) {
        int count=0;
        long steps=0;
     char[] chars=s.toCharArray();
     for(int i=chars.length-1;i>=0;i--)
     {
        if(chars[i]=='0')
        {
            count++;
        }
        else
        {
            steps+=count;
        }
     }
     return steps;
    }
}