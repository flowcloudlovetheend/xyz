package com.example.xyz.algorithm.link;

public class LinkNode {

    public int num;
    public String name;
    public LinkNode next;
    public LinkNode random;// 随机指向任意节点

    public LinkNode(int num) {
        this.num = num;
        this.name = null;
        this.next = null;
        this.random = null;
    }

    public void add(LinkNode add) {

    }

    public void nextNode(LinkNode cur) {

    }

    public boolean hasNext(LinkNode cur) {
        return cur.next != null;
    }

}
