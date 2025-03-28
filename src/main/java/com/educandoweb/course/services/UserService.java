package com.educandoweb.course.services;

import com.educandoweb.course.entities.TbUser;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<TbUser> findAll() {
        return userRepository.findAll();
    }

    public TbUser findById(Long id) {
        Optional<TbUser> obj =  userRepository.findById(id);
        return obj.get();
    }
}
