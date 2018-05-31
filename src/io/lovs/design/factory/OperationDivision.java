package io.lovs.design.factory;

/**
 * @program: category
 * @description: 除法操作
 * @author: Larry
 * @create: 2018-05-31 14:00
 **/
public class OperationDivision extends Operation {
    @Override
    int getResult() {
        return x / y;
    }
}
