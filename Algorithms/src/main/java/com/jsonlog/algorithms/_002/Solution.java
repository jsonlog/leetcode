package com.jsonlog.algorithms._002;

/**
 * Created by log on 10/1/2019.
 */
public class Solution {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        // 为方便操作加入的头节点
        ListNode head = new ListNode(0);
        // 当前节点
        ListNode cur = head;
        // 进位
        int carry = 0;

        // 两链表对应相加
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            // 获取进位
            carry = sum / 10;
            // 获取个位上的数
            ListNode node = new ListNode(sum % 10);
            cur.next = node;
            cur = node;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return head.next;
    }
}
