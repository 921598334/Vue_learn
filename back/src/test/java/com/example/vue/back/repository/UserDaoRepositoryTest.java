package com.example.vue.back.repository;

import com.example.vue.back.model.UserDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


//测试类需要手动添加该注解
@SpringBootTest
class UserDaoRepositoryTest {

    @Autowired
    UserDaoRepository userDaoRepository;

    @Test
    void findAll(){
        System.out.println(userDaoRepository.findAll());

    }

    @Test
    void insert(){


        for(int i=0;i<100;i++){
            UserDO userDO = new UserDO();
            userDO.setName("name"+i);
            userDO.setAccount("account"+i);
            userDO.setPwd("passwd"+i);
            userDaoRepository.save(userDO);
        }

    }

}