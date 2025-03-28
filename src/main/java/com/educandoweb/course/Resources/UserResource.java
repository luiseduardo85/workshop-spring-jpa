package com.educandoweb.course.Resources;

import com.educandoweb.course.entities.TbUser;
import com.educandoweb.course.services.UserService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<TbUser>> findAll(){
        List<TbUser> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <TbUser> findById(@PathVariable Long id){
        TbUser user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
