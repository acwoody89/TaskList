package com.tasklist.TaskList.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userid")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy ="user", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<TaskList> taskList = new ArrayList<>();
	
	
	public User() {
		
	}


	public User(Long id, String name, String email, String password, List<TaskList> taskList) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.taskList = taskList;
	}


	public User(String name, String email, String password, List<TaskList> taskList) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.taskList = taskList;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<TaskList> getTaskList() {
		return taskList;
	}


	public void setTaskList(List<TaskList> taskList) {
		this.taskList = taskList;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", userList="
				+ taskList + "]";
	}
	
	
	
	
}
