package com.example.xyz.algorithm.link;

/*
翻转链表
 */
public class ReverseLink {


    public LinkNode getCurr(LinkNode head) {
        LinkNode prev = null;
        LinkNode curr = head;
        while (curr != null) {
            LinkNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


}
