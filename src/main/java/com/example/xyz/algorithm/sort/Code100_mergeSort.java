package com.example.xyz.algorithm.sort;

// 归并排序
public class Code100_mergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 235, 435, 34, 6, 34, 643, 7, 3, 23, 2, 6, 32};

        // 递归版本
        process(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //

    }

    private static void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, R);
        mergeArr(arr, L, mid, R);
    }

    private static void mergeArr(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];

        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

}
