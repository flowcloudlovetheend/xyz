package com.example.xyz.algorithm.link;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
倒序：打印链表所有元素
 */
public class ReversePrintLink {

    public void reversePrint(LinkNode head) {
        Stack<LinkNode> stack = new Stack<>();
        while (head.hasNext(head)) {
            stack.push(head);
            head = head.next;
        }

        int size = stack.size();
        List<LinkNode> print = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            print.add(stack.pop());
        }
        System.out.println(print);
    }

}

