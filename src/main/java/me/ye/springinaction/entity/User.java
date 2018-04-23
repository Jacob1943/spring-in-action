package me.ye.springinaction.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Jacob
 * @date 13/04/2018
 */

@Data
public class User {

    private String id;
    private String name;
    private String password;
    private String salt;
}
