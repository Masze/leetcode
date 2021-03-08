package com.wj.leetcode;

import java.util.Arrays;

public class Solution {

    public static void rotate(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }
        if (matrix.length == 1 && matrix[0].length == 1) {
            return;
        }
        int half = matrix.length / 2;
        int n = matrix.length;

        int temp;
        //沿中线翻面
        for (int[] ints : matrix) {
            for (int j = 0; j < half; j++) {
                temp = ints[j];
                ints[j] = ints[n - j - 1];
                ints[n - j - 1] = temp;
            }
        }
        //沿斜线再翻面
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][n - i - 1];
                matrix[n - j - 1][n - i - 1] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(arr));
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
