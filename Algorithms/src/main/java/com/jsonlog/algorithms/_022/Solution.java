package com.jsonlog.algorithms._022;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n)
    {
        List<String> result = new LinkedList<String>();
        if (n > 0) {
            System.out.println("if (n > 0), n: " + n + "							 result: " + result);
            backtrack(result,"", n, n);//generateParenthesisCore
        }
        return result;
    }

    private void backtrack(List<String> result, String prefix, int left, int right)
    {

        if (left == 0 && right == 0) {
            result.add(prefix);
            System.out.println("if (left == 0 && right == 0), 				 prefix: " + prefix + "	 result: " + result);
        }
        // Has left Parenthesis
        if (left > 0) {
            System.out.println("if (left > 0), 		 left: " + left + "	 right: " + right + "	 prefix: " + prefix + "	 result: " + result);
            backtrack(result,prefix+'(', left-1, right);
        }
        // has more right Parenthesis
        if (left < right) {
            System.out.println("if (left < right), 	 left: " + left + "	 right: " + right + "	 prefix: " + prefix + "	 result: " + result);
            backtrack(result, prefix+')', left, right-1);
        }
    }
}
