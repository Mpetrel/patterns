package io.lovs.design.decorator;

/**
 * @program: category
 * @description: 主程序
 * @author: Larry
 * @create: 2018-05-25 14:03
 **/
public class Main {
    public static void main(String[] args) {
        Component c = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();
        a.setComponent(c);
        b.setComponent(a);
        b.operation();
    }
}
