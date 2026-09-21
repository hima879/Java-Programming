package Leetcode;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
        for(int i =0;i<strs.length;i++){
            char ch = prefix.charAt(i);
            for (int j = 1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) != ch){
                    return prefix.substring(0,i);
                }
            }
        }
        return prefix;
    }
    }
