package cn.griouges.learn.design.pattern.template;

/**
 * @author Liar
 */
public interface BeanFactory {
    Object getBean(String beanName);
    
    boolean containsBean(String beanName);
}