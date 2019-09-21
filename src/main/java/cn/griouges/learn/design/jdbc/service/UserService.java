package cn.griouges.learn.design.jdbc.service;

import cn.griouges.learn.design.jdbc.dao.UserDao;
import cn.griouges.learn.design.jdbc.model.User;

/**
 * @author Liar
 */
public class UserService implements UserDao {
    
    private UserDao userDao = new UserDaoImpl();
    
    @Override
    public void save(User user) {
        userDao.save(user);
    }
}