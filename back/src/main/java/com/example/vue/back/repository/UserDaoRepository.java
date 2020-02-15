package com.example.vue.back.repository;

import com.example.vue.back.model.UserDO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//第二个参数是主key
@Repository
public interface UserDaoRepository extends JpaRepository<UserDO, Long> {



}
