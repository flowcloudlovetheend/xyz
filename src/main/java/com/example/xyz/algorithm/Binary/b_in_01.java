package com.example.xyz.algorithm.Binary;

/*
打印一个整数的32位
 */
public class b_in_01 {


    public static void main(String[] args) {

        int num = 12;
        pringNum(12);
        pringNum(-12);
        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toBinaryString(-12));
    }

    private static void pringNum(int num) {
        for (int i = 31; i >= 0; i--) {
            if ((num >> i & 1) == 1) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }

}
