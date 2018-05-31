package io.lovs.design.proxy;

/**
 * @program: category
 * @description: 代理对象
 * @author: Larry
 * @create: 2018-05-28 09:57
 **/
public class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
