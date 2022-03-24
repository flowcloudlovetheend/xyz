package com.example.xyz.algorithm.test;

import java.util.Comparator;

// 加减乘除
public class Code4_jjcc {

    public static int add(int a, int b) {
        int sum = a;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }

    // 减法
    public static int minus(int a, int b) {
        return add(a, nerN(b));
    }

    public static int nerN(int n) {
        return add(~n, 1);
    }


    public static void main(String[] args) {
//        System.out.println(add(1, 2210));
//        System.out.println(minus(1, 2210));
//        test();
        System.out.println("aa".compareTo("a"));
    }

    public static void test() {
        int a = -20;
        System.out.println(a << 1);
        // 负数时，>> 补1右移  >>>补0右移（无符号位移）
        System.out.println(a >> 1);
        System.out.println(a >>> 1);
        // 10000000 00000000 00000000 00000000
        System.out.println(Integer.toBinaryString(-20));
        System.out.println(Integer.toBinaryString(2147483638));
        System.out.println(Integer.toBinaryString(-10));
        printInt(20);
    }

    public static void printInt(int a) {
        for (int i = 31; i > 0; i--) {
            System.out.print(a & (1 << i));
        }
    }




    class myC implements Comparator<myC> {

        int a = 0;


        @Override
        public int compare(myC o1, myC o2) {
            return 0;
        }
    }




}
