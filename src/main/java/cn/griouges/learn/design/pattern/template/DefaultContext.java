package cn.griouges.learn.design.pattern.template;

/**
 * @author Liar
 */
public class DefaultContext extends Context {
    
    BeanFactory beanFactory;
    
    public DefaultContext(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }
    
    @Override
    public BeanFactory getBeanFactory() {
        return this.beanFactory;
    }
}