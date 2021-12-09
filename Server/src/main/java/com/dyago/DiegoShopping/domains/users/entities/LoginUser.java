package com.dyago.DiegoShopping.domains.users.entities;

import com.dyago.DiegoShopping.commons.BaseEntity;

import javax.persistence.Entity;

@Entity(name="users")
public class LoginUser extends BaseEntity {
    private String email;
    private String password;
}
