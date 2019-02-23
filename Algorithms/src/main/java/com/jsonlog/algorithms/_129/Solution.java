package com.jsonlog.algorithms._129;

import com.jsonlog.algorithms.TreeNode;

public class Solution {
    public int sumNumbers(TreeNode root) {
        return DFS(root, 0);
    }

    public int DFS(TreeNode root, int sum){
        if(root == null) return 0;
        int newSum = sum*10 + root.val;
        if(root.left == null && root.right == null) return newSum;
        return DFS(root.left, newSum) + DFS(root.right, newSum);//left recursive
    }
}
