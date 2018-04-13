package me.ye.springinaction.repository.impl;

import me.ye.springinaction.entity.User;
import me.ye.springinaction.repository.UserRepository;

/**
 * @author Jacob
 * @date 13/04/2018
 */
public class UserRepositoryImpl extends UserRepository {

    @Override
    public User findById(String id) {
        return new User("1", "ZhangSan", )
    }
}
