package io.lovs.design.category;

/**
 * @program: category
 * @description: 正常收费子类
 * @author: Larry
 * @create: 2018-05-22 11:43
 **/
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
