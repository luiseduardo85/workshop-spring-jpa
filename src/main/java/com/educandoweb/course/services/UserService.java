package com.educandoweb.course.services;

import com.educandoweb.course.entities.TbUser;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.exception.ResourceNotFoundException;
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
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public TbUser insert(TbUser obj){
        return userRepository.save(obj);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public TbUser update(Long id, TbUser obj){
        TbUser entity = userRepository.getReferenceById(id);
        updateData(entity, obj);
        return userRepository.save(entity);
    }

    private void updateData(TbUser entity, TbUser obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
