package com.estudando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
