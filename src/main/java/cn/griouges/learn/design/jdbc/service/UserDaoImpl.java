package cn.griouges.learn.design.jdbc.service;

import cn.griouges.learn.design.jdbc.dao.UserDao;
import cn.griouges.learn.design.jdbc.model.User;

/**
 * @author Liar
 */
public class UserDaoImpl implements UserDao {
    
    @Override
    public void save(User user) {
        System.out.println("保存用户:" + user);
    }
}