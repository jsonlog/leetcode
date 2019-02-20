package com.jsonlog.algorithms._021;

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
//class Solution {
//    public:
//    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
//        ListNode dummy(0);
//        dummy.next = l1;
//        ListNode *cur = &dummy;
//
//        while(l2)
//        {
//            while(cur->next && cur->next->val<=l2->val) cur = cur->next; // if the current list, l1, has a smaller value, then move cur forward
//            l1 = cur->next; // otherwise, switch l1 and l2
//            cur->next = l2;
//            l2 = l1;
//        }
//        return dummy.next;
//    }
//};