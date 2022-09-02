package com.example.Engineer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "information")
public class Engineer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String dept;
	private String college;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Engineer(int id, String name, String dept, String college) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.college = college;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", dept=" + dept + ", college=" + college;
	}

}
