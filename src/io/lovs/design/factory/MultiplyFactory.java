package io.lovs.design.factory;

/**
 * @program: category
 * @description: 乘法工厂
 * @author: Larry
 * @create: 2018-05-31 14:01
 **/
public class MultiplyFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMultiply();
    }
}
