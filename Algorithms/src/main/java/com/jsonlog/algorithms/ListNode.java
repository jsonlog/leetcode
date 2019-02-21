package com.jsonlog.algorithms;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }
//    public ListNode(int[] ix){
//        val = ix[0];
//        ListNode temp = null;
//        this.next = temp;
//        for(int i=1;i<ix.length;i++){
//            temp = new ListNode(ix[i]);
//            temp = temp.next;
//        }
//    }
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
