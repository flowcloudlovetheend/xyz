package com.example.xyz.algorithm.link;

import java.util.PriorityQueue;

// 2个有序链表合并成一个
// K个有序链表合并成一个
public class Code2_TwoSortLinkToOne {

    public static void main(String[] args) {
        Node n1 = new Node(1, null);
        n1.next = new Node(3, null);
        n1.next.next = new Node(5, null);

        Node n2 = new Node(2, null);
        n2.next = new Node(3, null);
        n2.next.next = new Node(4, null);
        n2.next.next.next = new Node(9, null);

        Node[] nodes = new Node[2];
        nodes[0] = n1;
        nodes[1] = n2;

//        Node n = twoSortLinkToOne(n1, n2);
        Node n = kSortLinkToOne(nodes);
        printNode(n);

    }

    public static Node twoSortLinkToOne(Node one, Node two) {
        if (one == null || two == null) {
            return one == null ? two : one;
        }
        Node head = one.cnt <= two.cnt ? one : two;
        Node curL = head.next;
        Node curS = head == one ? two : one;
        Node cur = head;
        while (curL != null && curS != null) {
            if (curL.cnt <= curS.cnt) {
                cur.next = curL;
                curL = curL.next;
            } else {
                cur.next = curS;
                curS = curS.next;
            }
            cur = cur.next;
        }
        cur.next = curL != null ? curL : curS;
        return head;
    }


    public static Node kSortLinkToOne(Node[] nodes) {
        if (nodes == null) {
            return null;
        }
        PriorityQueue<Node> queue = new PriorityQueue<>(new MyCompartor());
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] != null) {
                queue.add(nodes[i]);
            }
        }

        if (queue.isEmpty()) {
            return null;
        }

        Node head = queue.poll();
        Node pre = head;
        if (pre.next != null) queue.add(pre.next);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            pre.next = cur;
            pre = cur;
            if (cur.next != null) {
                queue.add(cur.next);
            }
        }
        return head;
    }


    public static void printNode(Node node) {
        while (node != null) {
            System.out.print(node.cnt);
            node = node.next;
        }
        System.out.println("");
    }
}
