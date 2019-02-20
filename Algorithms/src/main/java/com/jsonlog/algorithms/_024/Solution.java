package com.jsonlog.algorithms._024;
import com.jsonlog.algorithms.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode p1 = head, p2 = head.next, p3 = head.next.next;//p2->p1->p3
        p2.next = p1;
        p1.next = p3;

        if(p3 != null)
            p1.next = swapPairs(p3);

        return p2;
    }
}
