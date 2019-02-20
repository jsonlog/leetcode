package com.jsonlog.algorithms._008;

public class Solution {
    public int myAtoi(String str) {
        String trimmedStr = str.trim();

        int sign = 1;
        int cursor = 0;
        if (trimmedStr.startsWith("+") || trimmedStr.startsWith("-")) {
            sign = trimmedStr.startsWith("+") ? 1 : -1;
            cursor++;
        }

        long result = 0;
        for(;cursor < trimmedStr.length(); cursor++) {
            if (trimmedStr.charAt(cursor) >= '0' && trimmedStr.charAt(cursor) <= '9'){
                result = result * 10 + Integer.valueOf(String.valueOf(trimmedStr.charAt(cursor)));
                if(result > Integer.MAX_VALUE){
                    return sign == -1 ? Integer.MIN_VALUE:Integer.MAX_VALUE;
                }
            } else {
                break;
            }
        }

        return (int)result * sign;
    }
}
