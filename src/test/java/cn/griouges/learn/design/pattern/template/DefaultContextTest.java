package cn.griouges.learn.design.pattern.template;

import cn.griouges.learn.design.pattern.template.bean.Rainbow;
import cn.griouges.learn.design.pattern.template.bean.Red;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DefaultContextTest {
    
    @Test
    public void getBeanFactory() {
        DefaultBeanFactory beanFactory = new DefaultBeanFactory();
        Map<String, Object> beans = new HashMap<>();
        beans.put("red", new Red());
        beans.put("rainBow", new Rainbow());
        
        beanFactory.setBeans(beans);
        
        Context context = new DefaultContext(beanFactory);
        
        if (context.containsBean("red")) {
            Red red = (Red) context.getBean("red");
            System.out.println(red);
        }
        System.out.println("context" + (context.containsBean("black") ? " " : " not ") + "contains black");
        
        System.out.println("context" + (context.containsBean("rainBow") ? " " : " not ") + "contains rainBow");
        
        
    }
}