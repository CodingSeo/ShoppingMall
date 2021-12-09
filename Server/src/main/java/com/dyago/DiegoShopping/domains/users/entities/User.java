package com.dyago.DiegoShopping.domains.users.entities;

import com.dyago.DiegoShopping.commons.BaseEntity;
import com.dyago.DiegoShopping.domains.users.enums.Gender;
import lombok.Getter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class User extends BaseEntity {
    private String name;
    private String email;
    private String phone;
    private Gender gender;
    private LocalDateTime birthday;
    private String address;
    private Long point;
    private Boolean isActive;
}
