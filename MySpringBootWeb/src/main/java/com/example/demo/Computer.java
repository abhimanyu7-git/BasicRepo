package com.example.demo;

import org.springframework.stereotype.Component;

public class Computer {
	private int id;
	private String StrBrand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStrBrand() {
		return StrBrand;
	}
	public void setStrBrand(String strBrand) {
		StrBrand = strBrand;
	}
	
}
