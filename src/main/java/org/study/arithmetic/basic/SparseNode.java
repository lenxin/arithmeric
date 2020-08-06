package org.study.arithmetic.basic;

/**
 *
 * @author yangxin
 * @date 2020/8/6 23:51
 */
public class SparseNode<T> {
    /**/
    private int row;
    /**/
    private int column;
    /**/
    private T value;

    public SparseNode() {
    }

    public SparseNode(int row, int column, T value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}