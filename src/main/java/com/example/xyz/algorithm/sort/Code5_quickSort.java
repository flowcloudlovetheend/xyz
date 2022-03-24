package com.example.xyz.algorithm.sort;

public class Code5_quickSort {

    public static int[] qsort(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && (arr[j] > pivot)) {
                j--;
            }
            while ((i < j) && (arr[i] < pivot)) {
                i++;
            }
            if ((arr[i] == arr[j]) && (i < j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i - 1 > start) arr = qsort(arr, start, i - 1);
        if (j + 1 < end) arr = qsort(arr, j + 1, end);
        return (arr);
    }

    public static int[] qukckSort(int[] arr) {
        return qsort(arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{9, 3, 2, 7, 9, 8, 4656, 34, 34, 4656, 5, 6, 36, 7, 10, 122344, 343, 57765, 23, 12321};
        int len = arr.length - 1;
        arr = qukckSort(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }


}
