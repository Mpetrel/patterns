package io.lovs.design.factory;

/**
 * 抽象操作
 */
public abstract class Operation {
    int x;
    int y;

    abstract int getResult();

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
