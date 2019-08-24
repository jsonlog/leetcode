package com.jsonlog.algorithms._002;
import com.jsonlog.algorithms.ListNode;
/**
 * Created by log on 10/1/2019.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        int sum = 0;
        while (l1 != null || l2 != null) {
            sum /= 10;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
        }
        if (sum / 10 == 1) {
            tmp.next = new ListNode(1);//this means there's a carry, so we add additional 1, e.g. [5] + [5] = [0, 1]
        }
        return result.val == 0 ? result.next : result;
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
