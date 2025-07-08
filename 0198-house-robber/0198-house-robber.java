class Solution {
    public int rob(int[] nums) {
    int rob = 0, notRob = 0;
    for (int num : nums) {
        int newRob = notRob + num; 
        notRob = Math.max(notRob, rob); 
        rob = newRob;
    }
    return Math.max(rob, notRob);
    }
  
}