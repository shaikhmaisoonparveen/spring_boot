package com.tns.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="placement")
public class Placement implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Id")
	private int Id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="college")
	@ManyToMany(mappedBy ="college")
	private String college;
	
	@Column(name="date")
	private int date;
	
	@Column(name="qulification")
	private String qulification;
	
	@Column(name="year")
	private int year;
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		Id = Id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	
	public String getQulification() {
		return qulification;
	}
	public void setQulification(String qulification) {
		this.qulification = qulification;
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
