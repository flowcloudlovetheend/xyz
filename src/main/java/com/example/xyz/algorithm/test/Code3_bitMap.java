package com.example.xyz.algorithm.test;

// 位图 存储数据
// int 4个字节 32byte 1个字节=8byte
// Long 64byte 可以代表64个数字是否存在
public class Code3_bitMap {

    static class BitMap {

        private long[] bits;

        public BitMap(int max) {
            bits = new long[(max + 64) >> 6];
        }

        public void add(int num) {
            bits[num >> 6] |= (1l << (num & 63));
        }

        public void delete(int num) {
            bits[num >> 6] &= ~(1l << (num & 63));
        }

        public boolean contains(int num) {
            return (bits[num >> 6] & (1l << (num & 63))) != 0;
        }

    }

    public static void main(String[] args) {
        BitMap bitMap = new BitMap(1024);
        bitMap.add(12);
        System.out.println(bitMap.contains(13));
    }


}
