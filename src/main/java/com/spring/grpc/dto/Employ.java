package com.spring.grpc.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employ 
{
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	

}
