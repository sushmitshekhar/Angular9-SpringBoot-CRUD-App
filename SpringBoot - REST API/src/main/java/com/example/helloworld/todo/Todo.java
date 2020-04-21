package com.example.helloworld.todo;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.stereotype.Component;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Component
@Entity
//@Document(indexName= "list", type= "Todo")
public class Todo{
	
	@Id
	@GeneratedValue
	private long id;

	private String username;
	private String description;
	private Date targetDate;
	private boolean isDone;

	private Todo(){
	}

	public Todo(long id, String username, String description, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public long getId() {
		return id;
	}

	public void setId(long idCounter) {
		this.id = idCounter;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

}
