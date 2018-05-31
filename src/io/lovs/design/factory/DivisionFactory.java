package io.lovs.design.factory;

/**
 * @program: category
 * @description: 除法工厂
 * @author: Larry
 * @create: 2018-05-31 14:03
 **/
public class DivisionFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDivision();
    }
}
