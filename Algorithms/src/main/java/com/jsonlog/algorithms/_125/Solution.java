package com.jsonlog.algorithms._125;

public class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");
//        return ss.equals(new StringBuilder(ss).reverse().toString());
        return isHelp(ss);
    }

    boolean isHelp(String s) {
        System.out.println(s);
        if (s.length() <= 1) {
            System.out.println("ttttttt");
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            System.out.println(s.charAt(0)+"fffff"+s.charAt(s.length() - 1));
            return false;
        }
        return isHelp(s.substring(1, s.length() - 1));
    }

//    string help(string s) {
//        string result;
//        int temp = 'A' - 'a';
//        for (auto ch : s) {
//            if (isalpha(ch) || isdigit(ch)) {
//                result.push_back(tolower(ch));
//            }
//        }
//        return result;
//    }
}
