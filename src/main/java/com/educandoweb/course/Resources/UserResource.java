package com.educandoweb.course.Resources;

import com.educandoweb.course.entities.TbUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<TbUser> findAll(){
        TbUser u = new TbUser(1L, "Maria", "maria@gmail.com", "123456789", "12345");
        return ResponseEntity.ok().body(u);
    }
}
