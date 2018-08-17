package com.epam.api.reest_assured_project;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("job")
	private String job;
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("createdAt")
	private String createdAt;
	
	@JsonProperty("updatedAt")
	private String updatedAt;
	
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String toString()
	{
			return "Employe Details:"  + "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Job:" + job + "\n" + "created AT:" + createdAt;

	}
	
}
