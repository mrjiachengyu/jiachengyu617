package com.jiachengyu.common.utils;

import java.util.*;

public class Person {

	private String name;
	private Integer age;
	private String about;
	private Date date;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", date=" + date + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Person(String name, Integer age, String about, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.date = date;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
