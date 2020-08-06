package org.study.arithmetic.ds.ch1;

import org.junit.Test;

/**
 * 稀疏矩阵
 *
 * @author yangxin
 * @date 2020/08/06 23:07
 */
public class SparseMatrixTest {
    @Test
    public void compress() {
        int[][] array = new int[6][7];
        array[0][1] = 12;
        array[0][2] = 9;
        array[2][0] = -3;
        array[2][5] = 14;
        array[3][2] = 24;
        array[4][1] = 18;
        array[5][0] = 15;
        array[5][3] = -7;

        System.out.println("原始数组");
        printMatrix(array);

        int[][] sparseMatrix = new int[10][3];

    }

    public void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] columns = array[i];
            for (int j = 0; j < columns.length; j++) {
                int value = columns[j];
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}