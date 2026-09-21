package Leetcode;

import java.util.HashSet;

public class slidingWindowVariable {
    public static void main(String[] args){
        String s = "abcbcaba";
        int res = LengthOfLongetsSubstring(s);
        System.out.println(res);
    }
    public static int LengthOfLongetsSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int start =0;
        int maxLen = 0;
        for(int end = 0;end<s.length(); end++){
            // If character is already in set, shrink window
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            // Add new character to window
            set.add(s.charAt(end));
            // Update maximum length
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
