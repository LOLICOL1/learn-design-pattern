package cn.griouges.learn.design.pattern.template;

/**
 * @author Liar
 */
public abstract class Context {
    
    public Object getBean(String name) {
        return getBeanFactory().getBean(name);
    }
    
    public boolean containsBean(String name) {
        return getBeanFactory().containsBean(name);
    }
    
    public abstract BeanFactory getBeanFactory();
}