package me.ye.springinaction.service;

import me.ye.springinaction.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Jacob
 * @date 13/04/2018
 */
@Service
public class UserService {


    public User getUserById(String id) {
        return new User();
    }

    public User save(User user) {
        return new User();
    }
}
