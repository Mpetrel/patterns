package io.lovs.design.factory;

/**
 * @program: category
 * @description: 乘法操作
 * @author: Larry
 * @create: 2018-05-31 13:59
 **/
public class OperationMultiply extends Operation {
    @Override
    int getResult() {
        return  x * y;
    }
}
