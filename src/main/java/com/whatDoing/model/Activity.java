package com.whatDoing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Activity {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String action;
	
	public Activity() {}

	public Activity(String name, String action) {
		super();
		this.name = name;
		this.action = action;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
