package io.lovs.design.factory;

/**
 * @program: category
 * @description: 主类
 * @author: Larry
 * @create: 2018-05-31 14:03
 **/
public class Main {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setX(12);
        operation.setY(32);
        System.out.println(operation.getResult());
        // 减法
        factory = new MinusFactory();
        operation = factory.createOperation();
        operation.setX(12);
        operation.setY(32);
        System.out.println(operation.getResult());
    }
}
