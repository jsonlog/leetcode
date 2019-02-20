package com.jsonlog.algorithms;
import com.jsonlog.algorithms._002.Solution.ListNode;

import javax.sql.rowset.serial.SerialStruct;

public class myClass {
    public static void main(String[] args) {
//        com.jsonlog.algorithms._001.Solution solution = new com.jsonlog.algorithms._001.Solution();
        com.jsonlog.algorithms._001.Solution solution1 = new com.jsonlog.algorithms._001.Solution();
        int[] result1 = solution1.twoSum(new int[]{2,7,11,15},9);
//        System.out.println(result1[0]+"-"+result1[1]);//new int[]{0, 4, 3, 0}, 0));

        com.jsonlog.algorithms._002.Solution solution2 = new com.jsonlog.algorithms._002.Solution();
        ListNode l1 = solution2.new ListNode(2);
        l1.next = solution2.new ListNode(4);
        l1.next.next = solution2.new ListNode(3);

        ListNode l2 = solution2.new ListNode(5);
        l2.next = solution2.new ListNode(6);
        l2.next.next = solution2.new ListNode(4);

        ListNode result2 = solution2.addTwoNumbers2(l1,l2);
        while (result2 != null){
//            System.out.print(result2.val);
            result2 = result2.next;
        }
        System.out.println();

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

        com.jsonlog.algorithms._016.Solution solution16 = new com.jsonlog.algorithms._016.Solution();
//        System.out.println(solution16.threeSumClosest(new int[]{-1, 2, 1, -4},1));

        com.jsonlog.algorithms._015.Solution solution15 = new com.jsonlog.algorithms._015.Solution();
//        System.out.println(solution15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}

