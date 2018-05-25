package io.lovs.design.decorator;

/**
 * @program: category
 * @description: 具体对象操作
 * @author: Larry
 * @create: 2018-05-25 13:46
 **/
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象操作");
    }
}
