package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int strRoll;
	private String strStudentName;
	private String strStudentClass;
	private String strStudentSection;
	
	@Autowired
	@Qualifier("Comp1")
	Computer comp;
	
	public Computer getComp() {
		return comp;
	}
	public void setComp(Computer comp) {
		this.comp = comp;
	}
	public Student() {
		super();
		System.out.println("in consturctor");
		
		// TODO Auto-generated constructor stub
	}
	public int getStrRoll() {
		return strRoll;
	}
	public void setStrRoll(int strRoll) {
		this.strRoll = strRoll;
	}
	public String getStrStudentName() {
		return strStudentName;
	}
	public void setStrStudentName(String strStudentName) {
		this.strStudentName = strStudentName;
	}
	public String getStrStudentClass() {
		return strStudentClass;
	}
	public void setStrStudentClass(String strStudentClass) {
		this.strStudentClass = strStudentClass;
	}
	public String getStrStudentSection() {
		return strStudentSection;
	}
	public void setStrStudentSection(String strStudentSection) {
		this.strStudentSection = strStudentSection;
	}
	
	
	public void show() {
		System.out.println("In show ...");
		comp.compile();
	}
	
	

}
