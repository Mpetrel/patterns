package io.lovs.design.factory;

/**
 * @program: category
 * @description: 加法操作
 * @author: Larry
 * @create: 2018-05-31 13:51
 **/
public class OperationAdd extends Operation {
    @Override
    int getResult() {
        return x + y;
    }
}
