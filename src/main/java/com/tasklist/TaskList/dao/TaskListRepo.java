package com.tasklist.TaskList.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tasklist.TaskList.entity.TaskList;
import com.tasklist.TaskList.entity.User;

@Repository
public interface TaskListRepo extends JpaRepository<TaskList, Long>{

	List<User> findByDescriptionContaining(String descKeyword);
	
	List<TaskList> findUserListBytaskid(Long id);
}
