package com.example.xyz.algorithm.link;

import java.util.HashSet;
import java.util.Set;

/*
1、查找任一重复的数字
2、在一个有序数组中查找某个数字的重复次数
3、长度为n-1，唯一且递增的数组[0-n],求缺少的数字
4、二位数组int[m][n].从上到下，左至右均递增，给定数target，判断是否存在
5、一个本来递增的数组被旋转过一次后，求最小数
 */
public class RepeatNum {

    public Integer checkRepeatNum(int[] nums) {
        Set<Integer> curs = new HashSet<>();
        // -1 代表无重复
        int repeat = -1;
        for (int i = 0; i < nums.length; i++) {
            if (!curs.add(nums[i])) {
                repeat = nums[i];
                break;
            }
        }
        return repeat;
    }


    /*
    二分查找
     */
    public Integer checkNumCount(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return rightIdx - leftIdx + 1;
        }
        return 0;
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


    //    static int[] arr = {0, 1, 2, 3, 4, 5, 7, 8, 9};
    static int[] arr = {0, 1, 3, 4, 5, 6, 7, 8};

    public static int checkTheOne(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }


    public static void main(String[] args) {
//        int i = checkTheOne(arr);
//        System.out.println(i);
//        System.out.println(forNums.length);
//
//        for (int i = 0; i < forNums.length; i++) {
//            for (int j = 0; j < forNums[i].length; j++) {
//                System.out.print(forNums[i][j] + "     ");
//            }
//            System.out.println();
//        }
        //
//        System.out.println(checkNum(forNums, 20));
        //
        System.out.println(checkMinNumOne(minNums));
    }


    static int[][] forNums = new int[10][20];

    static {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                forNums[i][j] = i + j;
            }
        }
    }

    /*
    问题4：
     */
    public static Boolean checkNum(int[][] nums, int target) {
        int i = nums.length - 1, j = 0;
        while (i >= 0 && j < nums[0].length) {
            if (nums[i][j] > target) {
                i--;
            } else if (nums[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }


    static int[] minNums = {1, 2, 2, 3, 0, 1};

    /*
    问题5：
     */
    public static int checkMinNumOne(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        int j = numbers.length - 1;
        for (int k = j; k > 0; k--) {
            if (numbers[k] - numbers[k - 1] < 0) {
                return numbers[k];
            }
        }
        return numbers[0];
    }

}
