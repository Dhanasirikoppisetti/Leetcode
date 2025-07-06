class Solution {
    public String reverseWords(String s) {
       char[] chars = s.toCharArray();
    int end = chars.length - 1;
    StringBuilder result = new StringBuilder();
    while (end >= 0) { 
        while (end >= 0 && chars[end] == ' ') end--;
        if (end < 0) break;
        int start = end;
        while (start >= 0 && chars[start] != ' ') start--;
        result.append(s.substring(start + 1, end + 1)).append(" ");
        end = start - 1;
    }
    return result.toString().trim();    
    }
}