package com.example.xyz.algorithm;


// 对数器

import com.example.xyz.algorithm.sort.Code5_quickSort;
import com.example.xyz.algorithm.sort.Code7_insertSort;

public class ArthLog {

    public static void main(String[] args) {

        int testTime = 50000;
        int maxSize = 100;
        int maxValue = 100;

        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            int[] arr1 = copyArray(arr);
            int[] arr2 = copyArray(arr);
            Code7_insertSort.insertionSort(arr1);
            Code5_quickSort.qukckSort(arr2);
            if (!isEquals(arr1, arr2)) {
                succeed = false;
                break;
            }
        }

        System.out.println(succeed ? "nice" : "fucking fucked");

        int[] arr = generateRandomArray(maxSize, maxValue);

    }

    public static boolean isEquals(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[2]) {
                return false;
            }
        }
        return true;
    }

    // 随机发生器
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[((int) ((maxSize + 1) * Math.random()))];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) ((maxValue) * Math.random());
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

}
