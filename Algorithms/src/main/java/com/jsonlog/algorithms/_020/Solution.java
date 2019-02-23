package com.jsonlog.algorithms._020;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by log on 10/1/2019.
 */
public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}

