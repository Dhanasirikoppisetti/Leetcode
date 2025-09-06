class Solution {
    public long minimumSteps(String s) {
      long count=0;
      char[] str=s.toCharArray();
       int left=0;
      int right=str.length-1;
      while(left<right)
      {
        if(str[left]=='1' && str[right]=='0')
        {
            count+=(right-left);
            left++;
            right--;
        }
        else if(str[left]=='0')
        {
            left++;
        }
        else
        {
            right--;
        }

      }
      return count;
    }
}