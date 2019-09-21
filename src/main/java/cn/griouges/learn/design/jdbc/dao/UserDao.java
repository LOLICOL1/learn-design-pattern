package cn.griouges.learn.design.jdbc.dao;

import cn.griouges.learn.design.jdbc.model.User;

/**
 * @author Liar
 */
public interface UserDao {
    void save(User user);
}
