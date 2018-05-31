package io.lovs.design.proxy;

/**
 * @program: category
 * @description: proxy代表的真实实体
 * @author: Larry
 * @create: 2018-05-28 09:56
 **/
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real request");
    }
}
