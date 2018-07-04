package com.seeth.springmvc.models;

public class Topic {
	
	String id;
	String name;
	
	public Topic() {
	
	}
	
	public Topic(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
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
		return "Topic [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
