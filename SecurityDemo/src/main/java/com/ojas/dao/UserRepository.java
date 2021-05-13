package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
