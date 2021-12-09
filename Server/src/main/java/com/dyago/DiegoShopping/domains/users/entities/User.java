package com.dyago.DiegoShopping.domains.users.entities;

import com.dyago.DiegoShopping.domains.users.enums.Gender;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Gender gender;
    private LocalDateTime birthday;
    private String address;
    private Long point;
    private Boolean isActive;
}
