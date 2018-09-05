package com.tasklist.TaskList.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tasklist.TaskList.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	@Query("SELECT DISTINCT email FROM User")
	List<String> findDistinctEmail();
	
	
	List<User> findByEmail(String email);
}