package io.lovs.design.factory;

/**
 * @program: category
 * @description: 加法类工厂
 * @author: Larry
 * @create: 2018-05-31 14:01
 **/
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
