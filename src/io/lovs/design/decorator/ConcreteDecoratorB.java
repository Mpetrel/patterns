package io.lovs.design.decorator;

/**
 * @program: category
 * @description: B类功能
 * @author: Larry
 * @create: 2018-05-25 13:58
 **/
public class ConcreteDecoratorB extends Decorator {
    protected Component component;

    @Override
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {
        System.out.println("B对象附加操作");
    }


}
