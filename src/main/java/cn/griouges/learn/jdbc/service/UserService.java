package cn.griouges.learn.jdbc.service;

import cn.griouges.learn.jdbc.dao.UserDao;
import cn.griouges.learn.jdbc.model.User;

/**
 * @author Liar
 */
public class UserService implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("保存用户:"+user);
    }
}