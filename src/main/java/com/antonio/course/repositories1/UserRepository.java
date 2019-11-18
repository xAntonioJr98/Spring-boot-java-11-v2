package com.antonio.course.repositories1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antonio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
