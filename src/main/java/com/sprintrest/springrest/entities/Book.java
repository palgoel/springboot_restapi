package com.sprintrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // introduce all get method in class for Book class
@Setter// introduce all set method in class for Book class
@NoArgsConstructor// introduce without param constructor for Book class
@AllArgsConstructor// introduce parameterized constructor for Book class

@Entity// this annotation tells dao/db that book is entity for which data needs to be entered. 
public class Book {
	
	@Id // this annotation represent that "id" is primary key
	private long id;
	private String title;
	private String description;
	
	//below commented code is used if we dont use lombok
//	public Book(long id, String title, String description) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.description = description;
//	}
//	public Book() {
//		super();
//	}
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	

}
