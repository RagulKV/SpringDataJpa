package com.ragul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ragul.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
