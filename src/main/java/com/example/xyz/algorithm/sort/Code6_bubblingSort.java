package com.example.xyz.algorithm.sort;

/*
冒泡:O{n}
 */
public class Code6_bubblingSort {

    public static void main(String[] args) {
        int b = 0;
        int[] a = {1, 9, 33, 2, 5, 34, 23, 98, 14};//冒泡排序
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }


}
