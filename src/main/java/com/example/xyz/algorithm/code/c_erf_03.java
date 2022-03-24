package com.example.xyz.algorithm.code;

/*
一个数组，一个数出现K次，其余出现M次
M>1 k<M
要求：空间O{1}，时间O{n}
 */
public class c_erf_03 {

    public static void main(String[] args) {
        int arr[] = new int[]{6, 10, 6, 6, 4, 4, 12, 4, 3, 3, 12, 12, 3};
        // 6   00110
        // 10  01010
        // 4   00100
        // 12  01100
        // 3   00011

        System.out.println(km(arr, 1, 3));
    }


    private static int km(int[] arr, int k, int m) {
        int[] t = new int[32];

        for (int num : arr) {
            for (int j = 31; j >= 0; j--) {
                t[j] += (num >> j) & 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (t[i] % m != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }


}
