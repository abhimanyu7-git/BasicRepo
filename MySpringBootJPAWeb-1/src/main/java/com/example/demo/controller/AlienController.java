package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.AlienDao;
import com.example.demo.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienDao ald;
	@RequestMapping("/")
	public String home() {
		
		
		return "home.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien Alien) {
		
		ald.save(Alien);
		return "home.jsp";
	}
}
