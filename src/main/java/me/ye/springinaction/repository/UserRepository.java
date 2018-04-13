package me.ye.springinaction.repository;

import me.ye.springinaction.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author Jacob
 * @date 13/04/2018
 */

@Component
public interface UserRepository {

    User findById(String id);
}
