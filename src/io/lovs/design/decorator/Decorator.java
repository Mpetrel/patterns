package io.lovs.design.decorator;

/**
 * @program: category
 * @description: 装饰器类
 * @author: Larry
 * @create: 2018-05-25 13:48
 **/
public class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写operation，实际执行Component的operation
     */
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
