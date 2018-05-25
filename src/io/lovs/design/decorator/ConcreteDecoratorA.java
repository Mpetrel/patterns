package io.lovs.design.decorator;

/**
 * @program: category
 * @description: A类功能
 * @author: Larry
 * @create: 2018-05-25 13:51
 **/
public class ConcreteDecoratorA extends Decorator {
    private String addedState;
    protected Component component;

    @Override
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
        addedState = "new state";
        System.out.println("具体装饰对象A的操作");
    }
}
