package com.jsonlog.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class myClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    /*
    Given binary tree [3,9,20,null,null,15,7],
        3
       / \
      9  20
        /  \
       15   7
     */
    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }
/*
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);

            boolean ret = new Solution().isValidBST(root);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
 */
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    public static void main(String[] args) {
//        com.jsonlog.algorithms._001.Solution solution = new com.jsonlog.algorithms._001.Solution();
        com.jsonlog.algorithms._001.Solution solution1 = new com.jsonlog.algorithms._001.Solution();
        int[] result1 = solution1.twoSum(new int[]{2,7,11,15},9);
//        System.out.println(result1[0]+"-"+result1[1]);//new int[]{0, 4, 3, 0}, 0));

        com.jsonlog.algorithms._002.Solution solution2 = new com.jsonlog.algorithms._002.Solution();
        ListNode l1 = new ListNode(new int[]{2,4,3});
        ListNode l2 = new ListNode(5,6,4);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        System.out.println(listNodeToString(solution2.addTwoNumbers(l1,l2)));

        com.jsonlog.algorithms._008.Solution solution8 = new com.jsonlog.algorithms._008.Solution();
//        System.out.println(solution8.myAtoi("42"));
//        System.out.println(solution8.myAtoi("   -42"));
//        System.out.println(solution8.myAtoi("4193 with words"));
//        System.out.println(solution8.myAtoi("words and 987"));
//        System.out.println(solution8.myAtoi("-91283472332"));

        com.jsonlog.algorithms._012.Solution solution12 = new com.jsonlog.algorithms._012.Solution();
//        System.out.println(solution12.intToRoman(58));

        com.jsonlog.algorithms._013.Solution solution13 = new com.jsonlog.algorithms._013.Solution();
//        System.out.println(solution13.romanToInt("MCMXCIV"));

        com.jsonlog.algorithms._015.Solution solution15 = new com.jsonlog.algorithms._015.Solution();
//        System.out.println(solution15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

        com.jsonlog.algorithms._016.Solution solution16 = new com.jsonlog.algorithms._016.Solution();
//        System.out.println(solution16.threeSumClosest(new int[]{-1, 2, 1, -4},1));

        com.jsonlog.algorithms._020.Solution solution20 = new com.jsonlog.algorithms._020.Solution();
//        System.out.println(solution20.isValid("([k])"));

        com.jsonlog.algorithms._021.Solution solution21 = new com.jsonlog.algorithms._021.Solution();
        ListNode l21 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l22 = new ListNode(1,new ListNode(3,new ListNode(4)));
//        System.out.println(solution21.mergeTwoLists(l21,l22));

        com.jsonlog.algorithms._023.Solution solution23 = new com.jsonlog.algorithms._023.Solution();
//        System.out.println(listNodeToString(solution23.mergeKLists(new ListNode[]{stringToListNode("[1,4,5]"),stringToListNode("[1,3,4]"),stringToListNode("[2,6]")})));

        com.jsonlog.algorithms._024.Solution solution24 = new com.jsonlog.algorithms._024.Solution();
        ListNode l24 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
//        System.out.println(solution24.swapPairs(l24));

        com.jsonlog.algorithms._027.Solution solution27 = new com.jsonlog.algorithms._027.Solution();
//        System.out.println(solution27.removeElement(new int[]{0,1,2,2,3,0,4,2},2));

        com.jsonlog.algorithms._028.Solution solution28 = new com.jsonlog.algorithms._028.Solution();
//        System.out.println(solution28.strStr("hello","ll"));

        com.jsonlog.algorithms._049.Solution solution49 = new com.jsonlog.algorithms._049.Solution();
//        System.out.println(solution49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        com.jsonlog.algorithms._056.Solution solution56 = new com.jsonlog.algorithms._056.Solution();
        List<Interval> result56 = Arrays.asList(new Interval(1,3),new Interval(2,6),new Interval(8,10),new Interval(10,14),new Interval(15,18));
//        System.out.println(solution56.merge(result56));

//        Iterator iterator = solution56.merge(result56).iterator();
//        while(iterator.hasNext()){
//            Interval interval = (Interval) iterator.next();
//            System.out.println(interval.start+","+interval.end);
//        }

        com.jsonlog.algorithms._057.Solution solution57 = new com.jsonlog.algorithms._057.Solution();
//        System.out.println(solution57.insert(Arrays.asList(new Interval(1,2),new Interval(3,5),new Interval(6,7),new Interval(8,10),new Interval(12,16)),new Interval(4,8)));

        com.jsonlog.algorithms._065.Solution solution65 = new com.jsonlog.algorithms._065.Solution();
//        System.out.println(solution65.isNumber(" 99e2.5 "));

        com.jsonlog.algorithms._067.Solution solution67 = new com.jsonlog.algorithms._067.Solution();
//        System.out.println(solution67.addBinary("1010","1011"));

        com.jsonlog.algorithms._069.Solution solution69 = new com.jsonlog.algorithms._069.Solution();
//        System.out.println(solution69.mySqrt(8));

        com.jsonlog.algorithms._088.Solution solution88 = new com.jsonlog.algorithms._088.Solution();
//        System.out.println(solution88.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3));

        com.jsonlog.algorithms._125.Solution solution125 = new com.jsonlog.algorithms._125.Solution();
//        System.out.println(solution125.isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(solution125.isPalindrome("race a car"));





//DP
        com.jsonlog.algorithms._070.Solution solution70 = new com.jsonlog.algorithms._070.Solution();
//        System.out.println(solution70.climbStairs(2));

        com.jsonlog.algorithms._091.Solution solution91 = new com.jsonlog.algorithms._091.Solution();
//        System.out.println(solution91.numDecodings("12"));


//BFS
        com.jsonlog.algorithms._102.Solution solution102 = new com.jsonlog.algorithms._102.Solution();
//        System.out.println(solution102.levelOrder(new TreeNode(3,9,new TreeNode(20,15,7))));

        com.jsonlog.algorithms._127.Solution solution127 = new com.jsonlog.algorithms._127.Solution();
//        System.out.println(solution127.ladderLength("hit","cog", new LinkedList<>(Arrays.asList("hot","dot","dog","lot","log","cog"))));


//DFS 22 79 98 129 //backtrack 39 40 ,46 47, 78 90, 131
        com.jsonlog.algorithms._022.Solution solution22 = new com.jsonlog.algorithms._022.Solution();
//        System.out.println(solution22.generateParenthesis(3));

        com.jsonlog.algorithms._039.Solution solution39 = new com.jsonlog.algorithms._039.Solution();
//        System.out.println(solution39.combinationSum(new int[]{2,3,5},8));

        com.jsonlog.algorithms._040.Solution solution40 = new com.jsonlog.algorithms._040.Solution();
//        System.out.println(solution40.combinationSum2(new int[]{10,1,2,7,6,1,5},8));

        com.jsonlog.algorithms._046.Solution solution46 = new com.jsonlog.algorithms._046.Solution();
//        System.out.println(solution46.permute(new int[]{1,2,3}));

        com.jsonlog.algorithms._047.Solution solution47 = new com.jsonlog.algorithms._047.Solution();
//        System.out.println(solution47.permuteUnique(new int[]{1,1,2}));

        com.jsonlog.algorithms._077.Solution solution77 = new com.jsonlog.algorithms._077.Solution();
//        System.out.println(solution77.combine(4,2));

        com.jsonlog.algorithms._078.Solution solution78 = new com.jsonlog.algorithms._078.Solution();
//        System.out.println(solution78.subsets(new int[]{1,2,3}));

        com.jsonlog.algorithms._079.Solution solution79 = new com.jsonlog.algorithms._079.Solution();
//        System.out.println(solution79.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));

        com.jsonlog.algorithms._090.Solution solution90 = new com.jsonlog.algorithms._090.Solution();
//        System.out.println(solution90.subsetsWithDup(new int[]{1,2,2}));

        com.jsonlog.algorithms._098.Solution solution98 = new com.jsonlog.algorithms._098.Solution();
//        System.out.println(solution98.isValidBST(stringToTreeNode("[5,1,4,null,null,3,6]")));

        com.jsonlog.algorithms._129.Solution solution129 = new com.jsonlog.algorithms._129.Solution();
//        System.out.println(solution129.sumNumbers(new TreeNode(1,2,3)));

        com.jsonlog.algorithms._131.Solution solution131 = new com.jsonlog.algorithms._131.Solution();
//        System.out.println(solution131.partition("aab"));


    }
    //6 7 9 14 19 26
    //kmp
    //记忆化搜索
    //分治法 分解子问题 最优解
}

