package com.example.xyz.algorithm.sort;
/*
插入排序:O{n}
 */

public class Code7_insertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 235, 435, 34, 6, 34, 643, 7, 3, 23, 2, 6, 32};

        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        yh();

    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void yh() {
        int i = 2, j = 4;
        i = i ^ j;
        System.out.println(i);
        j = i ^ j;
        System.out.println(j);
        i = i ^ j;
        System.out.println(i);
    }
}
