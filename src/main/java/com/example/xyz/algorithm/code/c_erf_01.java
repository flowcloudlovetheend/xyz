package com.example.xyz.algorithm.code;

/*
二分
数组、相邻位置不等，求局部最小问题
 */
public class c_erf_01 {


    public static void main(String[] args) {
        int arr[] = new int[]{9, 3, 2, 7, 9, 8, 4656, 34, 34, 4656, 5, 6, 36, 7, 10, 122344, 343, 57765, 23, 12321};
        int index = partMinNum(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }


    public static int partMinNum(int arr[]) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }

        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }

        int left = 1;
        int right = arr.length - 2;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

}
