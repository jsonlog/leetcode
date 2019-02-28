package com.jsonlog.algorithms._065;

public class Solution {
    public boolean isNumber(String s) {
        /**
         * isNumber(s)==true if and only if s=s1 or s1+'e'+s2, where s1, s2
         * are valid strings of a number without the char 'e', and s2 is an
         * integer.
         *
         * 'e' : valid_count=0~1; [boolean hasE]
         *
         * Valid chars in a string of a number without 'e':
         *
         * ' ' : valid_count=0~n; must appear at two ends
         *
         * '+/-' : valid_count=0~1; must be the first non-space valid char;
         * [boolean hasFirst]
         *
         * '.' : valid_count=0~1; cannot appear after 'e'; [boolean hasDot]
         *
         * '0~9' : valid_count=1~n; [boolean hasDigit]
         */

        s = s.trim();
        int n = s.length();
        if (n == 0)
            return false;

        boolean hasE, hasFirst, hasDot, hasDigit;
        hasE = hasFirst = hasDot = hasDigit = false;

        char c;
        for (int i = 0; i < n; i++) {
            c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                hasFirst = hasDigit = true;
                continue;
            }

            switch (c) {
                /*
                 * case ' ': continue;
                 */ // extend to accept any space everywhere
                case 'e':
                    // already has 'e' or no digit before 'e'
                    if (hasE || !hasDigit)
                        return false;
                    hasE = true;

                    // reset for the exponential number
                    hasFirst = hasDigit = false;
                    hasDot = true; // the exponent must be an integer, hence
                    // regard as if a dot exists already. Set
                    // hasDot = false extending to accept any
                    // (decimal) number as an exponent.
                    continue;
                case '+':
                case '-':
                    if (hasFirst)
                        return false;
                    hasFirst = true;
                    continue;
                case '.':
                    if (hasDot)
                        return false;
                    hasFirst = hasDot = true;
//                    hasDigit = false;    //added .1x  1. 0.0
                    continue;
                default:
                    return false;
            }
        }

        return hasDigit;
    }
    public boolean isNumber2(String s) {
        s = s.trim();
        if (s.length() == 0)
            return false;
        if (s.matches("[+-]?(([0-9]*\\.?[0-9]+)|([0-9]+\\.?[0-9]*))([eE][+-]?[0-9]+)?"))
            return true;
        else
            return false;

    }
}
