package com.tasklist.TaskList.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="tasks")
public class TaskList {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="taskid")
	private Long taskid;
	
	@Column(name="description")
	private String description;
	
	@Column(name="duedate")
	private Date duedate;
	
	@Column(name="completed")
	private String completed;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	public TaskList() {
		
	}

	public TaskList(Long taskid, String description, Date duedate, String completed, User user) {
		super();
		this.taskid = taskid;
		this.description = description;
		this.duedate = duedate;
		this.completed = completed;
		this.user = user;
	}

	public TaskList(String description, Date duedate, String completed, User user) {
		super();
		this.description = description;
		this.duedate = duedate;
		this.completed = completed;
		this.user = user;
	}

	public Long getTaskid() {
		return taskid;
	}

	public void setTaskid(Long taskid) {
		this.taskid = taskid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "TaskList [taskid=" + taskid + ", description=" + description + ", duedate=" + duedate + ", completed="
				+ completed + ", user=" + user + "]";
	}
	

}
