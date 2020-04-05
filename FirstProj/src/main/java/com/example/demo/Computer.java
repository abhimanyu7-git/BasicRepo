package com.example.demo;

import org.springframework.stereotype.Component;

@Component("Comp1")
public class Computer {
	private int id;
	private String strBrand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStrBrand() {
		return strBrand;
	}
	public void setStrBrand(String strBrand) {
		strBrand = strBrand;
	}
}
