package com.example.vue.back.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class UserDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String account;

    private String pwd;


}
