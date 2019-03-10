package com.jsonlog.algorithms;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }
    public ListNode(int... ix){
        val = ix[0];
        ListNode dummyRoot = new ListNode(0);
        ListNode temp = dummyRoot;
        for(int i=1;i<ix.length;i++){//1
            temp.next = new ListNode(ix[i]);
            temp = temp.next;
        }
        this.next = dummyRoot.next;
    }
    /*


        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
     */
    public ListNode(int x,ListNode next){
        val = x;
        this.next = next;
    }
    public String toString(){
        ListNode temp = this;
        String str = "";
        while (temp != null){
            str += temp.val+"=>";
            temp = temp.next;
        }
        return str;
    }
}
