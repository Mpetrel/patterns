package io.lovs.design.category;

/**
 * @program: category
 * @description: 持有对象
 * @author: Larry
 * @create: 2018-05-22 13:22
 **/
public class CashContext {
    private CashSuper cs;
    public CashContext(CashSuper cs) {
        this.cs = cs;
    }
    public double getResult (double money) {
        return cs.acceptCash(money);
    }
}
