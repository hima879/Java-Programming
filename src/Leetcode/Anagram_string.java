package Leetcode;

import java.util.*;

public class Anagram_string{
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        int k = p.length();
        for (int i = 0; i < s.length(); i++) {
            char newChar = s.charAt(i);
            sCount[newChar - 'a']++;

            if (i >= k) {
                char oldChar = s.charAt(i - k);
                sCount[oldChar - 'a']--;
            }

            if (i >= k - 1 && Arrays.equals(pCount, sCount)) {
                result.add(i - k + 1);
            }

        }
        return result;
    }
        public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println("\nResult: " + findAnagrams(s, p));
        }
}