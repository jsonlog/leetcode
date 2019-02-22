package com.jsonlog.algorithms;
import com.jsonlog.algorithms.ListNode;
import javax.sql.rowset.serial.SerialStruct;

public class myClass {
    public static void main(String[] args) {
//        com.jsonlog.algorithms._001.Solution solution = new com.jsonlog.algorithms._001.Solution();
        com.jsonlog.algorithms._001.Solution solution1 = new com.jsonlog.algorithms._001.Solution();
        int[] result1 = solution1.twoSum(new int[]{2,7,11,15},9);
//        System.out.println(result1[0]+"-"+result1[1]);//new int[]{0, 4, 3, 0}, 0));

        com.jsonlog.algorithms._002.Solution solution2 = new com.jsonlog.algorithms._002.Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
//        System.out.println(solution2.addTwoNumbers2(l1,l2));

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

        com.jsonlog.algorithms._024.Solution solution24 = new com.jsonlog.algorithms._024.Solution();
        ListNode l24 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
//        System.out.println(solution24.swapPairs(l24));

        com.jsonlog.algorithms._027.Solution solution27 = new com.jsonlog.algorithms._027.Solution();
//        System.out.println(solution27.removeElement(new int[]{0,1,2,2,3,0,4,2},2));

        com.jsonlog.algorithms._028.Solution solution28 = new com.jsonlog.algorithms._028.Solution();
//        System.out.println(solution28.strStr("hello","ll"));

        com.jsonlog.algorithms._067.Solution solution67 = new com.jsonlog.algorithms._067.Solution();
//        System.out.println(solution67.addBinary("1010","1011"));

        com.jsonlog.algorithms._069.Solution solution69 = new com.jsonlog.algorithms._069.Solution();
//        System.out.println(solution69.mySqrt(8));

        com.jsonlog.algorithms._070.Solution solution70 = new com.jsonlog.algorithms._070.Solution();
//        System.out.println(solution70.climbStairs(2));

        com.jsonlog.algorithms._088.Solution solution88 = new com.jsonlog.algorithms._088.Solution();
//        System.out.println(solution88.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3));

        com.jsonlog.algorithms._102.Solution solution102 = new com.jsonlog.algorithms._102.Solution();
//        System.out.println(solution102.levelOrder(new TreeNode(3,9,new TreeNode(20,15,7))));

        com.jsonlog.algorithms._125.Solution solution125 = new com.jsonlog.algorithms._125.Solution();
        System.out.println(solution125.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution125.isPalindrome("race a car"));
    }
    //6 7 9 14 19 26
    //kmp DP Dynamic Programming DFS BFS
}

