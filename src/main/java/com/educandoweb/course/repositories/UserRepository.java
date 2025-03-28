package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<TbUser, Long> {
}
