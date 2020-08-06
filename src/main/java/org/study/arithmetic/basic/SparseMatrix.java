package org.study.arithmetic.basic;

/**
 * 稀疏矩阵
 *
 * @author yangxin
 * @date 2020/08/06 23:07
 */
public interface SparseMatrix {
    /**
     * 创建稀疏矩阵
     */
    void createSparseMatrix();

    /**
     * 销毁稀疏矩阵
     */
    void destroySparseMatrix();

    /**
     * 复制稀疏矩阵
     */
    void copySparseMatrix();

    /**
     * 求稀疏矩阵的和，稀疏矩阵的行数和列数对应相等
     */
    void addSparseMatrix();

    /**
     * 求稀疏矩阵的差，稀疏矩阵的行数和列数对应相等
     */
    void subSparseMatrix();

    /**
     * 求稀疏矩阵的乘积，稀疏矩阵的列数等于行数
     */
    void multiplySparseMatrix();

    /**
     * 求稀疏矩阵的转置矩阵
     */
    void transposeSparseMatrix();
}