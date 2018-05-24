package io.lovs.design.category;

/**
 * @program: category
 * @description: 测试类
 * @author: Larry
 * @create: 2018-05-24 09:19
 **/
public class Main {
    public static void main(String[] args) {
        // normal charge
        CashSuper cashSuper = new CashNormal();
        CashContext context = new CashContext(cashSuper);
        double result = context.getResult(94);
        System.out.println("normal charge: " + result);
        // rebate charge
        context = new CashContext(new CashRebate("0.7"));
        result = context.getResult(94);
        System.out.println("rebate charge: " + result);

        // cash return charge
        context = new CashContext(new CashReturn("50", "5"));
        result = context.getResult(94);
        System.out.println("cash return charge: " + result);


    }
}
