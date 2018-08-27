package com.eshare.domain.model.user;

import java.util.List;

/**
 * User的仓存接口
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
public interface UserRepository  {

    User findById(Long id);

    User findByIdcard(String idcard);

    User findByName(String name);

    void save(User user);

    Long deleteUser(String id);

    boolean updateUser(User user);

    List<User> findAll();
}
