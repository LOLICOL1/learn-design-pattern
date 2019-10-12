package cn.griouges.learn.design.pattern.template;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Liar
 */
public class DefaultBeanFactory implements BeanFactory {
    
    private Map<String, Object> beans = new HashMap<>();
    
    public void setBeans(Map<String, Object> beans) {
        this.beans = beans;
    }
    
    @Override
    public Object getBean(String beanName) {
        return beans.get(beanName);
    }
    
    @Override
    public boolean containsBean(String beanName) {
        return getBean(beanName) != null;
    }
}