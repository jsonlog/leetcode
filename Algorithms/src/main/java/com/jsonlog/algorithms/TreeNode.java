package com.jsonlog.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     TreeNode(int x) { val = x; }
     TreeNode(int x,int left,int right) {
         this(x,new TreeNode(left),new TreeNode(right));
     }
     TreeNode(int x,TreeNode left,int right) {
         this(x,left,new TreeNode(right));
     }
     TreeNode(int x,int left,TreeNode right) {
         this(x,new TreeNode(left),right);
     }
     TreeNode(int x,TreeNode left,TreeNode right) {
         this.left = left;
         val = x;
         this.right=right;
     }
 }