package com.srkit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MySqlEntity 
{
	/*
	 * select * from MySqlEntity; 
	 * select * from hibernate_sequence;
	 * 
	 * create table hibernate_sequence(next_val int); 
	 * insert into hibernate_sequence value(100);
	 * 
	 */	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	private String name;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
