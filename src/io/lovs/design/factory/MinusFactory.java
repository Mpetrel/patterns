package io.lovs.design.factory;

/**
 * @program: category
 * @description: 减法工厂
 * @author: Larry
 * @create: 2018-05-31 14:02
 **/
public class MinusFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMinus();
    }
}
