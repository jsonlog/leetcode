package com.jsonlog.algorithms._013;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> ROMAN_NUMERALS = new HashMap<>();
        ROMAN_NUMERALS.put('I', 1);
        ROMAN_NUMERALS.put('V', 5);
        ROMAN_NUMERALS.put('X', 10);
        ROMAN_NUMERALS.put('L', 50);
        ROMAN_NUMERALS.put('C', 100);
        ROMAN_NUMERALS.put('D', 500);
        ROMAN_NUMERALS.put('M', 1000);
        int num = ROMAN_NUMERALS.get(s.charAt(s.length() - 1));
        for(int i = 0;i < s.length()-1; i++){
            if(ROMAN_NUMERALS.get(s.charAt(i)) < ROMAN_NUMERALS.get(s.charAt(i+1))){
                num -=  ROMAN_NUMERALS.get(s.charAt(i));
            } else {
                num +=  ROMAN_NUMERALS.get(s.charAt(i));
            }
        }
        return num;
    }
}
