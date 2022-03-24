package com.example.xyz.algorithm.link;

// 2个数字链表相加
// 1-3-5   +  2-3-4-9   out  3-6-9-9
public class Code1_addTwoNumLink {

    public static void main(String[] args) {
        Node n1 = new Node(1, null);
        n1.next = new Node(3, null);
        n1.next.next = new Node(5, null);

        Node n2 = new Node(2, null);
        n2.next = new Node(3, null);
        n2.next.next = new Node(4, null);
        n2.next.next.next = new Node(9, null);

        Node r = addTwoNum(n1, n2);
        printNode(r);
    }

    public static Node addTwoNum(Node n, Node l) {
        if (n == null || l == null) {
            return n == null ? l : n;
        }
        int nen = nodeLength(n);
        int len = nodeLength(l);

        Node head = nen >= len ? n : l;
        Node curN = head;// 较长的链表
        Node curL = head == n ? l : n;// 较短的
        Node last = head;
        Node cur = head;
        int carry = 0;
        int num = 0;
        while (curL != null) {
            num = curN.cnt + curL.cnt + carry;
            cur.cnt = (num % 10);
            last = curN;
            carry = (num / 10);
            curN = curN.next;
            curL = curL.next;
            cur = cur.next;
        }
        while (curN != null) {
            num = curN.cnt + carry;
            cur.cnt = (num % 10);
            carry = (num / 10);
            last = curN;
            curN = curN.next;
        }

        if (carry != 0) {
            last.next = new Node(1, null);
        }
        return head;
    }


    public static int nodeLength(Node node) {
        int len = 0;
        while (node != null) {
            node = node.next;
            len++;
        }
        return len;
    }

    public static void printNode(Node node) {
        while (node != null) {
            System.out.print(node.cnt);
            node = node.next;
        }
        System.out.println("");
    }

}
