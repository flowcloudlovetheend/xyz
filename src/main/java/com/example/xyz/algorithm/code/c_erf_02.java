package com.example.xyz.algorithm.code;

/*
一个数组，2个数出现奇数次，其他出现偶数次，找出这2个数
 */
public class c_erf_02 {


    public static void main(String[] args) {
        int arr[] = new int[]{6, 10, 6, 6, 4, 4, 12, 12, 3, 3, 12, 12};
        // 6   00110
        // 10  01010
        // 4   00100
        // 12  01100
        // 3   00011
        // 所有数异或结果eor = 01100,即2个出现奇数次的数的异或结果
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        System.out.println(eor);
        // 取反
        int eor_back = (~eor + 1);
        System.out.println(eor_back);
        // 取一个1，暂定最右的1
        int ro = eor & eor_back;
        System.out.println(ro);

        int onlyOne = 0;// 找出其中一个
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] & ro) !=0){
                onlyOne ^= arr[i];
            }
        }

        System.out.println(onlyOne + "和" + (onlyOne ^ eor));
    }


}
