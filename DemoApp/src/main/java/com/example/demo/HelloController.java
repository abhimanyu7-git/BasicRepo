package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 

class Greeting {
	  String greeting;
	  Greeting(String g) {
	    greeting = g;
	  }
	  public String getGreeting() {
	    return greeting;
	  }
	}
	 
	@Controller
	public class HelloController {
	    @RequestMapping(value="/Home",produces = "application/json")
	    @ResponseBody
	    Object home() {
	        return new Greeting("Hello World!");
	    }
	}