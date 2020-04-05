package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	/*
	 * @RequestMapping("home") public String home(@RequestParam("name") String
	 * strName, HttpSession session) { //strName = req.getParameter("name");
	 * session.setAttribute("name", strName);
	 * System.out.println("in Home |||||||||||||"+ strName); return "home"; }
	 */
	
	@RequestMapping("home")
	public ModelAndView view(Computer obj) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", obj);
		mv.setViewName("home");	
		
		
		
		return mv;
	}
}
