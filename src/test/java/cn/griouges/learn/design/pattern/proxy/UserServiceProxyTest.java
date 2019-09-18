package cn.griouges.learn.design.pattern.proxy;

import cn.griouges.learn.design.pattern.observer.DatatableSubject;
import cn.griouges.learn.design.pattern.observer.Subject;
import cn.griouges.learn.design.pattern.observer.UserTableObserver;
import cn.griouges.learn.jdbc.dao.UserDao;
import cn.griouges.learn.jdbc.model.User;
import cn.griouges.learn.jdbc.service.UserService;
import org.junit.Test;

public class UserServiceProxyTest {
    
    @Test
    public void getProxy() {
        Subject subject = new DatatableSubject();  //数据表主题
        
        UserTableObserver userTableObserver = new UserTableObserver(subject); //用户表观察者
        userTableObserver.register(); //向数据表主题注册观察者
    
        UserDao proxy = (UserDao) new UserServiceProxy(new UserService(), subject).getProxy(); //获得代理对象,向数据库保存记录后通知观察者进行同步
        
        proxy.save(new User("lisi", 20));
    }
}