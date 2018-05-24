package io.lovs.design.category;

/**
 * @program: category
 * @description: 打折收费子类
 * @author: Larry
 * @create: 2018-05-22 11:43
 **/
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.valueOf(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
