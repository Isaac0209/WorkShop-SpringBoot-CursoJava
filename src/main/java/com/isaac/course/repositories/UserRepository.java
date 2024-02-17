package com.isaac.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaac.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
