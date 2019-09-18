package cn.griouges.learn.design.pattern.proxy;

import cn.griouges.learn.design.pattern.observer.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Liar
 */
public class UserServiceProxy {
    private Object target;
    private Subject subject;
    
    public UserServiceProxy(Object target, Subject subject) {
        this.target = target;
        this.subject = subject;
    }
    
    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new UserServiceInvocationHandler());
    }
    
    class UserServiceInvocationHandler implements InvocationHandler {
        
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = method.invoke(target, args);
            if (method.getName().equals("save"))
                subject.notifyObserver(target);
            return result;
        }
    }
}