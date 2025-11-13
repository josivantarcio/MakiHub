package com.jtarcio.makiHub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtarcio.makiHub.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
