package com.example.xyz.algorithm.link;


import java.util.Comparator;

public class MyCompartor implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        return o1.cnt - o2.cnt;
    }
}
