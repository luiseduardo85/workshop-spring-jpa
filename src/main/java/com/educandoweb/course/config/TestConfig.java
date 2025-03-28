package com.educandoweb.course.config;

import com.educandoweb.course.entities.TbUser;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        TbUser u1 = new TbUser(null, "Maria", "maria@gmail.com", "999999999", "123456");
        TbUser u2 = new TbUser(null, "João", "joao@gmail.com", "987654321", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }

}
