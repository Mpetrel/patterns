package io.lovs.design.factory;

/**
 * @program: category
 * @description: 减法操作
 * @author: Larry
 * @create: 2018-05-31 13:55
 **/
public class OperationMinus extends Operation {
    @Override
    int getResult() {
        return x - y;
    }
}
