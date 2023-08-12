package com.restemp.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restemp.userservice.entities.User;

public interface UserRepository  extends JpaRepository<User, Long> {

}
